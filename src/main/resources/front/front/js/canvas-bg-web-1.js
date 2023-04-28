window.requestAnimFrame = (function() {
	return window.requestAnimationFrame ||
		window.webkitRequestAnimationFrame ||
		window.mozRequestAnimationFrame ||
		window.oRequestAnimationFrame ||
		window.msRequestAnimationFrame ||
		function(callback) {
			window.setTimeout(callback, 1000 / 60);
		};
})();
var c = document.getElementById('canvas');
var $ = c.getContext('2d');
var w = c.width = window.innerWidth;
var h = c.height = window.innerHeight;
var _w = w * 0.5;
var _h = h * 0.5;
var arr = [];
var cnt = 0;

window.addEventListener('load', resize);
window.addEventListener('resize', resize, false);

function resize() {
	c.width = w = window.innerWidth;
	c.height = h = window.innerHeight;
	c.style.position = 'absolute';
	c.style.left = (window.innerWidth - w) *
		.01 + 'px';
	c.style.top = (window.innerHeight - h) *
		.01 + 'px';
}

function anim() {
	cnt++;
	if (cnt % 6) draw();
	window.requestAnimFrame(anim);
}
anim();

function draw() {
	var splot = {
		x: rng(_w - 900, _w + 900),
		y: rng(_h - 900, _h + 900),
		r: rng(20, 80),
		spX: rng(-1, 1),
		spY: rng(-1, 1)
	};

	arr.push(splot);
	while (arr.length > 100) {
		arr.shift();
	}
	$.clearRect(0, 0, w, h);

	for (var i = 0; i < arr.length; i++) {

		splot = arr[i];;
		$.fillStyle = rndCol();
		$.beginPath();
		$.arc(splot.x, splot.y, splot.r, 0, Math.PI * 2, true);
		$.shadowBlur = 80;
		$.shadowOffsetX = 2;
		$.shadowOffsetY = 2;
		$.shadowColor = rndCol();
		$.globalCompositeOperation = 'lighter';
		$.fill();

		splot.x = splot.x + splot.spX;
		splot.y = splot.y + splot.spY;
		splot.r = splot.r * 0.96;
	}
}

function rndCol() {
	var r = Math.floor(Math.random() * 180);
	var g = Math.floor(Math.random() * 60);
	var b = Math.floor(Math.random() * 100);
	return "rgb(" + r + "," + g + "," + b + ")";
}

function rng(min, max) {
	return Math.floor(Math.random() * (max - min + 1)) + min;
}

package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.atw */
public final class atw extends C5163c {
    private final int height = 60;
    private final int width = 60;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                Paint a = C5163c.m7876a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 4.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                a3.setColor(-1);
                Path l = C5163c.m7884l(looper);
                l.moveTo(15.0f, 1.0f);
                l.cubicTo(15.0f, 0.44771522f, 15.447715f, 0.0f, 16.0f, 0.0f);
                l.lineTo(32.0f, 0.0f);
                l.cubicTo(32.552284f, 0.0f, 33.0f, 0.44771522f, 33.0f, 1.0f);
                l.lineTo(33.0f, 6.0f);
                l.cubicTo(33.0f, 6.5522847f, 32.552284f, 7.0f, 32.0f, 7.0f);
                l.lineTo(16.0f, 7.0f);
                l.cubicTo(15.447715f, 7.0f, 15.0f, 6.5522847f, 15.0f, 6.0f);
                l.lineTo(15.0f, 1.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                Paint a4 = C5163c.m7876a(a, looper);
                a4.setColor(-1);
                a4.setStrokeWidth(4.5f);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(7.25f, 8.25f);
                l2.lineTo(40.75f, 8.25f);
                l2.lineTo(40.75f, 50.75f);
                l2.lineTo(7.25f, 50.75f);
                l2.lineTo(7.25f, 8.25f);
                l2.close();
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                g = C5163c.m7878a(a2, 1.0f, 0.0f, 17.0f, 0.0f, 1.0f, 17.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a5 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 1.0f);
                l.cubicTo(0.0f, 0.44771522f, 0.44771522f, -2.6645353E-15f, 1.0f, -2.6645353E-15f);
                l.lineTo(2.0f, -2.6645353E-15f);
                l.cubicTo(2.5522847f, -2.6645353E-15f, 3.0f, 0.44771522f, 3.0f, 1.0f);
                l.lineTo(3.0f, 21.0f);
                l.cubicTo(3.0f, 21.552284f, 2.5522847f, 22.0f, 2.0f, 22.0f);
                l.lineTo(1.0f, 22.0f);
                l.cubicTo(0.44771522f, 22.0f, 0.0f, 21.552284f, 0.0f, 21.0f);
                l.lineTo(0.0f, 1.0f);
                l.close();
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                a5 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(11.998957f, -1.7763568E-15f);
                l.cubicTo(11.447248f, -1.7763568E-15f, 11.0f, 0.43945834f, 11.0f, 1.0024617f);
                l.lineTo(11.0f, 20.997538f);
                l.cubicTo(11.0f, 21.551182f, 11.44266f, 22.0f, 11.998957f, 22.0f);
                l.lineTo(13.001043f, 22.0f);
                l.cubicTo(13.552752f, 22.0f, 14.0f, 21.560541f, 14.0f, 20.997538f);
                l.lineTo(14.0f, 1.0024617f);
                l.cubicTo(14.0f, 0.44881737f, 13.55734f, -1.7763568E-15f, 13.001043f, -1.7763568E-15f);
                l.lineTo(11.998957f, -1.7763568E-15f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a5 = C5163c.m7876a(k, looper);
                a5.setColor(-1);
                l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 7.0f);
                l.cubicTo(0.0f, 6.4477153f, 0.44771522f, 6.0f, 1.0f, 6.0f);
                l.lineTo(47.0f, 6.0f);
                l.cubicTo(47.552284f, 6.0f, 48.0f, 6.4477153f, 48.0f, 7.0f);
                l.lineTo(48.0f, 8.0f);
                l.cubicTo(48.0f, 8.552285f, 47.552284f, 9.0f, 47.0f, 9.0f);
                l.lineTo(1.0f, 9.0f);
                l.cubicTo(0.44771522f, 9.0f, 0.0f, 8.552285f, 0.0f, 8.0f);
                l.lineTo(0.0f, 7.0f);
                l.close();
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}

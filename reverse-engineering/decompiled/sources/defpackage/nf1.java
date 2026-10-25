package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.text.TextStyle;
import app.chalo.constants.Source;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.RealViewSizeResolver;
import coil3.size.Size;
import java.util.List;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class nf1 {
    public static PathBuilder A(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void E(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static Dimension a(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.f11601a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            DimensionKt.a(i4);
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        DimensionKt.a(i5);
        return new Dimension.Pixels(i5);
    }

    public static Size b(RealViewSizeResolver realViewSizeResolver) {
        View view = realViewSizeResolver.f11602a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Dimension dimensionA = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (dimensionA == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Dimension dimensionA2 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (dimensionA2 == null) {
            return null;
        }
        return new Size(dimensionA, dimensionA2);
    }

    public static int c(int i, int i2, long j) {
        return (Color.m4612hashCodeimpl(j) + i) * i2;
    }

    public static int d(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(Source source, int i, int i2) {
        return (source.hashCode() + i) * i2;
    }

    public static PathBuilder g(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static String h(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String i(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String j(Uri uri, String str) {
        return str + uri;
    }

    public static String k(String str, int i, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String n(StringBuilder sb, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, String str) {
        sb.append(uiEventHandler$Companion$fromLambda$1);
        sb.append(str);
        return sb.toString();
    }

    public static String o(ASN1TaggedObject aSN1TaggedObject, StringBuilder sb) {
        sb.append(aSN1TaggedObject.getTagNo());
        return sb.toString();
    }

    public static StringBuilder p(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void s(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m4613toStringimpl(j));
        sb.append(str);
    }

    public static void t(Modifier.Companion companion, float f, Composer composer, int i) {
        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composer, i);
        composer.endReplaceGroup();
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void w(StringBuilder sb, Long l, String str, Long l2, String str2) {
        sb.append(l);
        sb.append(str);
        sb.append(l2);
        sb.append(str2);
    }

    public static PathBuilder x(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }
}

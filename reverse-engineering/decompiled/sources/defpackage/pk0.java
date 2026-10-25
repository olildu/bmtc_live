package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.common.util.Log;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class pk0 {
    public static int A(int i, int i2, Placeable placeable) {
        return (i - placeable.getWidth()) / i2;
    }

    public static PathBuilder B(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        return pathBuilder;
    }

    public static List C(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static int a(int i, int i2, Placeable placeable) {
        return (i - placeable.getHeight()) / i2;
    }

    public static int b(UIShape uIShape, int i, int i2) {
        return (uIShape.hashCode() + i) * i2;
    }

    public static int c(TextUIState textUIState, int i, int i2) {
        return (textUIState.hashCode() + i) * i2;
    }

    public static Modifier d(String str, int i, Modifier modifier) {
        return PlotlineComposeWidgetKt.a(modifier, str + i);
    }

    public static PathBuilder e(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        return pathBuilder;
    }

    public static String f(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String g(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String h(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static String i(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String j(StringBuilder sb, ChaloColorToken chaloColorToken, String str) {
        sb.append(chaloColorToken);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, Long l, String str) {
        sb.append(l);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(String str, ChaloPadding chaloPadding, String str2, ChaloPadding chaloPadding2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(chaloPadding);
        sb.append(str2);
        sb.append(chaloPadding2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(String str, ImageUIState imageUIState, String str2, TextUIState.ChaloTextUIState chaloTextUIState, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(imageUIState);
        sb.append(str2);
        sb.append(chaloTextUIState);
        sb.append(str3);
        return sb;
    }

    public static List o(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static NoWhenBranchMatchedException p(Composer composer, int i) {
        composer.startReplaceGroup(i);
        composer.endReplaceGroup();
        return new NoWhenBranchMatchedException();
    }

    public static Function2 q(ComposeUiNode.Companion companion, Composer composer, Integer num, Composer composer2) {
        Updater.m3919initimpl(composer, num, companion.getSetCompositeKeyHash());
        Updater.m3921reconcileimpl(composer2, companion.getApplyOnDeactivatedNodeAssertion());
        return companion.getSetModifier();
    }

    public static ASN1ObjectIdentifier r(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static void s(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void v(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m3923setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3923setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
    }

    public static void w(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void x(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void y(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }

    public static void z(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }
}

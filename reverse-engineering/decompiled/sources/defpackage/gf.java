package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class gf {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static int a(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i, int i2) {
        return (uiEventHandler$Companion$fromLambda$1.hashCode() + i) * i2;
    }

    public static MutableState b(float f, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj, Composer composer) {
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7276boximpl(Dp.m7278constructorimpl(f)), snapshotMutationPolicy, i, obj);
        composer.updateRememberedValue(mutableStateMutableStateOf$default);
        return mutableStateMutableStateOf$default;
    }

    public static PathBuilder c(float f, float f2) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        return pathBuilder;
    }

    public static PathBuilder d(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.close();
        return pathBuilder;
    }

    public static ValueElementSequence e(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static String f(Source source, String str, String str2) {
        return str + source + str2;
    }

    public static String g(Exception exc, String str) {
        return str + exc;
    }

    public static String h(String str, Object obj) {
        return str + obj;
    }

    public static String i(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String j(StringBuilder sb, UIShape uIShape, String str) {
        sb.append(uIShape);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder l(ChaloPadding chaloPadding, ChaloColorToken chaloColorToken, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(chaloPadding);
        sb.append(str2);
        sb.append(chaloColorToken);
        sb.append(str3);
        return sb;
    }

    public static List m(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List n(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void o(int i, Integer num, String str, String str2, HashMap map) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static void p(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void q(MutableState mutableState, Density density, int i) {
        mutableState.setValue(Dp.m7276boximpl(density.mo401toDpu2uoSUM(i)));
    }

    public static void r(Modifier.Companion companion, float f, Composer composer, int i) {
        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composer, i);
        composer.endReplaceGroup();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void u(PopUpToConfig popUpToConfig, ChaloNavigationManager chaloNavigationManager) {
        chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(popUpToConfig));
    }

    public static void v(Boolean bool, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(bool);
        sb.append(str3);
    }

    public static void w(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static boolean x(Modifier.Companion companion, float f, Composer composer, int i) {
        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composer, i);
        return ComposerKt.isTraceInProgress();
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
    }
}

package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.core.component.AppComponentFactory;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.uistate.button.ButtonUIState;
import com.arkivanov.decompose.ComponentContext;
import com.google.android.gms.measurement.internal.zzic;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b3 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static PathBuilder a(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        return pathBuilder;
    }

    public static PathBuilder b(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static String c(char c, String str, StringBuilder sb) {
        sb.append(c);
        String string = sb.toString();
        Intrinsics.h(string, str);
        return string;
    }

    public static String d(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String e(String str, int i, char c) {
        return str + i + c;
    }

    public static String f(String str, int i, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String g(String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String h(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String i(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.h(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.h(lowerCase, str3);
        return lowerCase;
    }

    public static List j(PathBuilder pathBuilder, float f) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List k(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List l(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException m(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static SpreadBuilder n(int i, SceneArgs sceneArgs, ComponentContext componentContext, Object[] objArr) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(i);
        spreadBuilder.a(componentContext);
        spreadBuilder.a(sceneArgs);
        spreadBuilder.b(objArr);
        return spreadBuilder;
    }

    public static Scope o(AppComponentFactory appComponentFactory) {
        appComponentFactory.getClass();
        return GlobalContext.f18817a.a().c.d;
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void r(zzic zzicVar, String str) {
        zzicVar.zzaW().zzb().zza(str);
    }

    public static boolean s(int i, int i2, Composer composer, Modifier modifier, ButtonUIState buttonUIState) {
        ChaloFilledButtonKt.a(i, i2, composer, modifier, buttonUIState);
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static boolean t(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static List u(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException w(String str) {
        ListUtilsKt.throwNoSuchElementException(str);
        return new KotlinNothingValueException();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void y(zzic zzicVar, String str) {
        zzicVar.zzaW().zze().zza(str);
    }

    public static List z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}

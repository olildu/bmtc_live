package defpackage;

import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.common.util.Log;
import app.chalo.location.LatLng;
import io.ktor.util.StringValues;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.compose.resources.LanguageQualifier;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i71 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void E(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void a(StringValues stringValues, Function2 function2) {
        for (Map.Entry entry : stringValues.a()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static String b(StringValues stringValues, String name) {
        Intrinsics.i(name, "name");
        List listB = stringValues.b(name);
        if (listB != null) {
            return (String) CollectionsKt.H(listB);
        }
        return null;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int d(LatLng latLng, int i, int i2) {
        return (latLng.hashCode() + i) * i2;
    }

    public static PathBuilder e(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static String f(String str, char c) {
        return str + c;
    }

    public static StringBuilder g(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static List h(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List i(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static Set j(String str) {
        return SetsKt.g(new LanguageQualifier(str));
    }

    public static ClassReference k(Scope scope, String str, ParametersHolder parametersHolder, String str2, Class cls) {
        Intrinsics.i(scope, str);
        Intrinsics.i(parametersHolder, str2);
        return Reflection.a(cls);
    }

    public static FactoryInstanceFactory l(BeanDefinition beanDefinition, Module module) {
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        module.a(factoryInstanceFactory);
        return factoryInstanceFactory;
    }

    public static SingleInstanceFactory m(BeanDefinition beanDefinition, Module module) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        module.a(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static StringQualifier n(Module module, SingleInstanceFactory singleInstanceFactory, String str) {
        new KoinDefinition(module, singleInstanceFactory);
        return new StringQualifier(str);
    }

    public static void o(DrawContext drawContext, long j) {
        drawContext.getCanvas().restore();
        drawContext.mo5081setSizeuvyYCjk(j);
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void r(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static StackTraceElement[] s() {
        return new Throwable().getStackTrace();
    }

    public static PathBuilder t(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static List u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static FactoryInstanceFactory w(BeanDefinition beanDefinition, Module module) {
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        module.a(factoryInstanceFactory);
        return factoryInstanceFactory;
    }

    public static SingleInstanceFactory x(BeanDefinition beanDefinition, Module module) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        module.a(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static PathBuilder z(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }
}

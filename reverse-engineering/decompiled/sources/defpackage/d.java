package defpackage;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.AbstractDateTimeFormatBuilder;
import kotlinx.datetime.internal.format.AlternativesParsingFormatStructure;
import kotlinx.datetime.internal.format.AppendableFormatStructure;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.ConcatenatedFormatStructure;
import kotlinx.datetime.internal.format.ConstantFormatStructure;
import kotlinx.datetime.internal.format.OptionalFormatStructure;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void E(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void F(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void G(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void a(AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilder, Function1[] otherFormats, Function1 function1) {
        Intrinsics.i(otherFormats, "otherFormats");
        ArrayList arrayList = new ArrayList(otherFormats.length);
        for (Function1 function2 : otherFormats) {
            AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilderQ = abstractDateTimeFormatBuilder.q();
            function2.invoke(abstractDateTimeFormatBuilderQ);
            arrayList.add(new ConcatenatedFormatStructure(abstractDateTimeFormatBuilderQ.k().f17999a));
        }
        AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilderQ2 = abstractDateTimeFormatBuilder.q();
        function1.invoke(abstractDateTimeFormatBuilderQ2);
        abstractDateTimeFormatBuilder.k().a(new AlternativesParsingFormatStructure(new ConcatenatedFormatStructure(abstractDateTimeFormatBuilderQ2.k().f17999a), arrayList));
    }

    public static void b(AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilder, String str, Function1 function1) {
        AppendableFormatStructure appendableFormatStructureK = abstractDateTimeFormatBuilder.k();
        AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilderQ = abstractDateTimeFormatBuilder.q();
        function1.invoke(abstractDateTimeFormatBuilderQ);
        appendableFormatStructureK.a(new OptionalFormatStructure(str, new ConcatenatedFormatStructure(abstractDateTimeFormatBuilderQ.k().f17999a)));
    }

    public static CachedFormatStructure c(AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilder) {
        ArrayList arrayList = abstractDateTimeFormatBuilder.k().f17999a;
        new ConcatenatedFormatStructure(arrayList);
        return new CachedFormatStructure(arrayList);
    }

    public static void d(AbstractDateTimeFormatBuilder abstractDateTimeFormatBuilder, String value) {
        Intrinsics.i(value, "value");
        abstractDateTimeFormatBuilder.k().a(new ConstantFormatStructure(value));
    }

    public static int e(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int f(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static PathBuilder g(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        return pathBuilder;
    }

    public static PathBuilder h(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.moveToRelative(f3, f4);
        return pathBuilder;
    }

    public static PathBuilder i(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static String j(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static String k(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String l(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static StringBuilder m(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder n(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static LinkedHashMap o(Object obj) {
        ResultKt.b(obj);
        return new LinkedHashMap();
    }

    public static List p(PathBuilder pathBuilder, float f) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void t(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static int u(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static PathBuilder v(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        return pathBuilder;
    }

    public static PathBuilder w(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static List x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }
}

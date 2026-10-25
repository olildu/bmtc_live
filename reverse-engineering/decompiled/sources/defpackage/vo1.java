package defpackage;

import android.database.Cursor;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.room.util.TableInfo;
import coil.size.Dimension;
import coil.size.RealViewSizeResolver;
import coil.size.Size;
import com.google.ads.interactivemedia.v3.internal.zzabw;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.pal.zzach;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class vo1 {
    public static String A(String str, String str2) {
        return str + str2;
    }

    public static String B(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static List C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static int D(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int E(int i, int i2, int i3) {
        return zzach.zzA(i) + i2 + i3;
    }

    public static Object a(WebSocketSession webSocketSession, Frame.Close close, Continuation continuation) {
        Object objSend = webSocketSession.o().send(close, continuation);
        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : Unit.f17538a;
    }

    public static Dimension b(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.f11435a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new Dimension.Pixels(i5);
        }
        return null;
    }

    public static Size c(RealViewSizeResolver realViewSizeResolver) {
        View view = realViewSizeResolver.f11437a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Dimension dimensionB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (dimensionB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Dimension dimensionB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (dimensionB2 == null) {
            return null;
        }
        return new Size(dimensionB, dimensionB2);
    }

    public static int d(int i, int i2, int i3) {
        return zzabw.zzw(i) + i2 + i3;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return zzach.zzA(i) + i2 + i3 + i4;
    }

    public static Integer f(int i, Integer num, String str, String str2, HashMap map) {
        map.put(num, str);
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str2);
        return numValueOf;
    }

    public static Integer g(HashMap map, String str, Integer num, Cursor cursor, String str2) {
        map.put(str, num);
        return Integer.valueOf(cursor.getColumnIndex(str2));
    }

    public static Object h(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String i(char c, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String j(int i, String str) {
        return str + i;
    }

    public static String k(IllegalArgumentException illegalArgumentException, StringBuilder sb) {
        sb.append(illegalArgumentException.getMessage());
        return sb.toString();
    }

    public static String l(String str, TableInfo tableInfo, String str2, TableInfo tableInfo2) {
        return str + tableInfo + str2 + tableInfo2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashSet q(HashMap map, String str, TableInfo.Column column, int i) {
        map.put(str, column);
        return new HashSet(i);
    }

    public static List r(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static Map s(String str, String str2) {
        return MapsKt.h(new Pair(str, str2));
    }

    public static void t(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void u(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }

    public static void v(int i, String str, String str2) {
        zzdo.zzf(str2, str + i);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void x(String str, String str2, String str3) {
        Intrinsics.i(str + str2, str3);
    }

    public static int y(int i, int i2, int i3) {
        return zzada.zzE(i) + i2 + i3;
    }

    public static int z(int i, int i2, int i3, int i4) {
        return zzada.zzE(i) + i2 + i3 + i4;
    }
}

package defpackage;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Measurable;
import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.db.SqlCursor;
import io.github.alexzhirkevich.keight.js.JsAny;
import io.github.alexzhirkevich.keight.js.MappingKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;
import org.slf4j.event.Level;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class cb0 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static PathBuilder B(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static boolean a(Logger logger, Level level) {
        int i = level.toInt();
        if (i == 0) {
            return logger.isTraceEnabled();
        }
        if (i == 10) {
            return logger.isDebugEnabled();
        }
        if (i == 20) {
            return logger.isInfoEnabled();
        }
        if (i == 30) {
            return logger.isWarnEnabled();
        }
        if (i == 40) {
            return logger.isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
    }

    public static int b(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.mo5939measureBRTryo0(j));
        return i + i2;
    }

    public static PathBuilder c(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static JsAny d(String str, JsAny jsAny, String str2, ClassReference classReference) {
        return MappingKt.a(str + jsAny + str2 + classReference);
    }

    public static Long e(Long l, SqlCursor sqlCursor, int i) {
        Intrinsics.f(l);
        Long l2 = sqlCursor.getLong(i);
        Intrinsics.f(l2);
        return l2;
    }

    public static Object f(SqlCursor sqlCursor, int i, ColumnAdapter columnAdapter) {
        String string = sqlCursor.getString(i);
        Intrinsics.f(string);
        return columnAdapter.a(string);
    }

    public static Object g(SqlCursor sqlCursor, int i, EnumColumnAdapter enumColumnAdapter) {
        String string = sqlCursor.getString(i);
        Intrinsics.f(string);
        return enumColumnAdapter.a(string);
    }

    public static String h(int i, String str) {
        return i + str;
    }

    public static String i(SqlCursor sqlCursor, String str, int i) {
        Intrinsics.i(sqlCursor, str);
        String string = sqlCursor.getString(i);
        Intrinsics.f(string);
        return string;
    }

    public static String j(String str, SqlCursor sqlCursor, int i) {
        Intrinsics.f(str);
        String string = sqlCursor.getString(i);
        Intrinsics.f(string);
        return string;
    }

    public static String k(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static List l(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List n(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void o(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void r(Long l, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(l);
        sb.append(str3);
    }

    public static void s(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static PathBuilder u(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List v(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static PathBuilder y(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }
}

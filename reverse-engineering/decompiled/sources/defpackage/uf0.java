package defpackage;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.uistate.base.UiAlignment;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class uf0 {
    public static List A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static int a(float f, int i, int i2) {
        return (Dp.m7284hashCodeimpl(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return CodedOutputStream.q(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return CodedOutputStream.s(i) + i2 + i3 + i4;
    }

    public static int d(UiAlignment.Horizontal horizontal, int i, int i2) {
        return (horizontal.hashCode() + i) * i2;
    }

    public static int e(UiAlignment.Vertical vertical, int i, int i2) {
        return (vertical.hashCode() + i) * i2;
    }

    public static PathBuilder f(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        return pathBuilder;
    }

    public static PathBuilder g(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static ValueElementSequence h(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m7276boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static Long i(SqlCursor sqlCursor, String str, int i) {
        Intrinsics.i(sqlCursor, str);
        Long l = sqlCursor.getLong(i);
        Intrinsics.f(l);
        return l;
    }

    public static Long j(String str, SqlCursor sqlCursor, int i) {
        Intrinsics.f(str);
        Long l = sqlCursor.getLong(i);
        Intrinsics.f(l);
        return l;
    }

    public static String k(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String n(Long l, SqlCursor sqlCursor, int i) {
        Intrinsics.f(l);
        String string = sqlCursor.getString(i);
        Intrinsics.f(string);
        return string;
    }

    public static String o(String str, IOException iOException) {
        return str + iOException;
    }

    public static String p(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static List u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static Ref.ObjectRef v(Object obj) {
        ResultKt.b(obj);
        return new Ref.ObjectRef();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void x(SqlPreparedStatement sqlPreparedStatement, String str, long j, int i) {
        Intrinsics.i(sqlPreparedStatement, str);
        sqlPreparedStatement.d(i, Long.valueOf(j));
    }

    public static List y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }
}

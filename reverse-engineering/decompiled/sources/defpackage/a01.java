package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;
    public final /* synthetic */ FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a01(Function11 function11, int i) {
        this.f149a = i;
        this.b = (FunctionReferenceImpl) function11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function11, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function11, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function11, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function8, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function8, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function8, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function8, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f149a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String string3 = sqlCursor.getString(4);
                Long l = sqlCursor.getLong(5);
                Intrinsics.f(l);
                Long l2 = sqlCursor.getLong(6);
                Long l3 = sqlCursor.getLong(7);
                String strN = uf0.n(l3, sqlCursor, 8);
                Long l4 = sqlCursor.getLong(9);
                String string4 = sqlCursor.getString(10);
                Intrinsics.f(string4);
                return this.b.invoke(strI, string, strJ, string2, string3, l, l2, l3, strN, l4, string4);
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string5 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string5, sqlCursor, 2);
                String string6 = sqlCursor.getString(3);
                String string7 = sqlCursor.getString(4);
                Long l5 = sqlCursor.getLong(5);
                Intrinsics.f(l5);
                Long l6 = sqlCursor.getLong(6);
                Long l7 = sqlCursor.getLong(7);
                String strN2 = uf0.n(l7, sqlCursor, 8);
                Long l8 = sqlCursor.getLong(9);
                String string8 = sqlCursor.getString(10);
                Intrinsics.f(string8);
                return this.b.invoke(strI2, string5, strJ2, string6, string7, l5, l6, l7, strN2, l8, string8);
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string9 = sqlCursor.getString(1);
                String strJ3 = cb0.j(string9, sqlCursor, 2);
                String string10 = sqlCursor.getString(3);
                String string11 = sqlCursor.getString(4);
                Long l9 = sqlCursor.getLong(5);
                Intrinsics.f(l9);
                Long l10 = sqlCursor.getLong(6);
                Long l11 = sqlCursor.getLong(7);
                String strN3 = uf0.n(l11, sqlCursor, 8);
                Long l12 = sqlCursor.getLong(9);
                String string12 = sqlCursor.getString(10);
                Intrinsics.f(string12);
                return this.b.invoke(strI3, string9, strJ3, string10, string11, l9, l10, l11, strN3, l12, string12);
            case 3:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string13 = sqlCursor.getString(1);
                String strJ4 = cb0.j(string13, sqlCursor, 2);
                String string14 = sqlCursor.getString(3);
                String strJ5 = cb0.j(string14, sqlCursor, 4);
                Long l13 = sqlCursor.getLong(5);
                return this.b.invoke(strI4, string13, strJ4, string14, strJ5, l13, cb0.e(l13, sqlCursor, 6), sqlCursor.getLong(7));
            case 4:
                String strI5 = cb0.i(sqlCursor, "cursor", 0);
                String string15 = sqlCursor.getString(1);
                String strJ6 = cb0.j(string15, sqlCursor, 2);
                String string16 = sqlCursor.getString(3);
                String strJ7 = cb0.j(string16, sqlCursor, 4);
                Long l14 = sqlCursor.getLong(5);
                String strN4 = uf0.n(l14, sqlCursor, 6);
                Long l15 = sqlCursor.getLong(7);
                Intrinsics.f(l15);
                return this.b.invoke(strI5, string15, strJ6, string16, strJ7, l14, strN4, l15);
            case 5:
                String strI6 = cb0.i(sqlCursor, "cursor", 0);
                String string17 = sqlCursor.getString(1);
                String strJ8 = cb0.j(string17, sqlCursor, 2);
                String string18 = sqlCursor.getString(3);
                String strJ9 = cb0.j(string18, sqlCursor, 4);
                Long l16 = sqlCursor.getLong(5);
                String strN5 = uf0.n(l16, sqlCursor, 6);
                Long l17 = sqlCursor.getLong(7);
                Intrinsics.f(l17);
                return this.b.invoke(strI6, string17, strJ8, string18, strJ9, l16, strN5, l17);
            default:
                String strI7 = cb0.i(sqlCursor, "cursor", 0);
                String string19 = sqlCursor.getString(1);
                String strJ10 = cb0.j(string19, sqlCursor, 2);
                String string20 = sqlCursor.getString(3);
                String strJ11 = cb0.j(string20, sqlCursor, 4);
                Long l18 = sqlCursor.getLong(5);
                String strN6 = uf0.n(l18, sqlCursor, 6);
                Long l19 = sqlCursor.getLong(7);
                Intrinsics.f(l19);
                return this.b.invoke(strI7, string19, strJ10, string20, strJ11, l18, strN6, l19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a01(Function8 function8, int i) {
        this.f149a = i;
        this.b = (FunctionReferenceImpl) function8;
    }
}

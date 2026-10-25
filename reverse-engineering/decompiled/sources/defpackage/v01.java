package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19791a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ v01(long j, String str, String str2, int i) {
        this.f19791a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement sqlPreparedStatement = (SqlPreparedStatement) obj;
        switch (this.f19791a) {
            case 0:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 1:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 2:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 3:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 4:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 5:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 6:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 7:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 8:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 9:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 10:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 11:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            case 12:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
            default:
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                sqlPreparedStatement.bindString(2, this.d);
                break;
        }
        return Unit.f17538a;
    }
}

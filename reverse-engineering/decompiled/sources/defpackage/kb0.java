package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17483a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ String c;

    public /* synthetic */ kb0(int i, String str, Long l) {
        this.f17483a = i;
        this.b = l;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f17483a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, this.b);
                execute.bindString(1, this.c);
                break;
            case 1:
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, this.b);
                execute.bindString(1, this.c);
                break;
            case 2:
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, this.b);
                execute.bindString(1, this.c);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, this.b);
                execute.bindString(1, this.c);
                break;
        }
        return Unit.f17538a;
    }
}

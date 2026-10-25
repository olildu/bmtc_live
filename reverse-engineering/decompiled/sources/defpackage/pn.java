package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19050a;
    public final /* synthetic */ Collection b;
    public final /* synthetic */ String c;

    public /* synthetic */ pn(Collection collection, String str, int i) {
        this.f19050a = i;
        this.b = collection;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f19050a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                Collection collection = this.b;
                int i = 0;
                for (Object obj2 : collection) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i, (String) obj2);
                    i = i2;
                }
                execute.bindString(collection.size(), this.c);
                break;
            case 1:
                Intrinsics.i(execute, "$this$execute");
                Collection collection2 = this.b;
                int i3 = 0;
                for (Object obj3 : collection2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i3, (String) obj3);
                    i3 = i4;
                }
                execute.bindString(collection2.size(), this.c);
                break;
            case 2:
                Intrinsics.i(execute, "$this$execute");
                Collection collection3 = this.b;
                int i5 = 0;
                for (Object obj4 : collection3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i5, (String) obj4);
                    i5 = i6;
                }
                execute.bindString(collection3.size(), this.c);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                Collection collection4 = this.b;
                int i7 = 0;
                for (Object obj5 : collection4) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i7, (String) obj5);
                    i7 = i8;
                }
                execute.bindString(collection4.size(), this.c);
                break;
        }
        return Unit.f17538a;
    }
}

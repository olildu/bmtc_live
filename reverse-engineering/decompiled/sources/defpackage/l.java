package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18267a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ l(Collection collection, int i) {
        this.f18267a = i;
        this.b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zRetainAll$lambda$0;
        switch (this.f18267a) {
            case 0:
                zRetainAll$lambda$0 = AbstractPersistentList.retainAll$lambda$0(this.b, obj);
                break;
            case 1:
                zRetainAll$lambda$0 = this.b.contains(obj);
                break;
            case 2:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                int i = 0;
                for (Object obj2 : this.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i, (String) obj2);
                    i = i2;
                }
                return Unit.f17538a;
            case 3:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                int i3 = 0;
                for (Object obj3 : this.b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute2.bindString(i3, (String) obj3);
                    i3 = i4;
                }
                return Unit.f17538a;
            case 4:
                zRetainAll$lambda$0 = this.b.contains(obj);
                break;
            case 5:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                int i5 = 0;
                for (Object obj4 : this.b) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute3.d(i5, Long.valueOf(((Number) obj4).longValue()));
                    i5 = i6;
                }
                return Unit.f17538a;
            case 6:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                int i7 = 0;
                for (Object obj5 : this.b) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute4.bindString(i7, (String) obj5);
                    i7 = i8;
                }
                return Unit.f17538a;
            case 7:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                int i9 = 0;
                for (Object obj6 : this.b) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute5.bindString(i9, (String) obj6);
                    i9 = i10;
                }
                return Unit.f17538a;
            case 8:
                zRetainAll$lambda$0 = SnapshotStateList.retainAll$lambda$0(this.b, (List) obj);
                break;
            case 9:
                zRetainAll$lambda$0 = SnapshotStateSet.retainAll$lambda$0(this.b, (Set) obj);
                break;
            default:
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                int i11 = 0;
                for (Object obj7 : this.b) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute6.bindString(i11, (String) obj7);
                    i11 = i12;
                }
                return Unit.f17538a;
        }
        return Boolean.valueOf(zRetainAll$lambda$0);
    }
}

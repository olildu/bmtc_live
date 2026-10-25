package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15800a;
    public final /* synthetic */ SnapshotStateMap b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ h80(SnapshotStateMap snapshotStateMap, String str, MutableState mutableState, int i) {
        this.f15800a = i;
        this.b = snapshotStateMap;
        this.c = str;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15800a;
        ((Integer) obj).getClass();
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.d.setValue(bool);
                this.b.put(this.c, bool);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d.setValue(bool2);
                this.b.put(this.c, bool2);
                break;
        }
        return Unit.f17538a;
    }
}

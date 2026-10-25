package defpackage;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class na1 implements ObserverHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18468a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na1(Object obj, int i) {
        this.f18468a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        switch (this.f18468a) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$1((Function2) this.b);
                break;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$1((Function1) this.b);
                break;
            default:
                SnapshotObserverKt.observeSnapshots$lambda$1((SnapshotObserver) this.b);
                break;
        }
    }
}

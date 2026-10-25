package defpackage;

import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class um0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19760a;
    public final /* synthetic */ NetworkInspectorComponent b;

    public /* synthetic */ um0(NetworkInspectorComponent networkInspectorComponent, int i) {
        this.f19760a = i;
        this.b = networkInspectorComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19760a) {
            case 0:
                this.b.F0(NetworkInspectorIntent.OnBackClicked.f2301a);
                break;
            case 1:
                this.b.F0(NetworkInspectorIntent.Refresh.f2303a);
                break;
            default:
                this.b.F0(NetworkInspectorIntent.OnBackClicked.f2301a);
                break;
        }
        return Unit.f17538a;
    }
}

package defpackage;

import app.chalo.uistate.base.UiEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ei implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15555a;
    public final /* synthetic */ UiEventHandler b;

    public /* synthetic */ ei(UiEventHandler uiEventHandler, int i) {
        this.f15555a = i;
        this.b = uiEventHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15555a) {
            case 0:
                UiEventHandler uiEventHandler = this.b;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                break;
            case 1:
                this.b.a();
                break;
            default:
                UiEventHandler uiEventHandler2 = this.b;
                if (uiEventHandler2 != null) {
                    uiEventHandler2.a();
                }
                break;
        }
        return Unit.f17538a;
    }
}

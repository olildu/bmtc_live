package defpackage;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class im implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15926a;
    public final /* synthetic */ TextUIState.ChaloTextUIState b;

    public /* synthetic */ im(TextUIState.ChaloTextUIState chaloTextUIState, int i) {
        this.f15926a = i;
        this.b = chaloTextUIState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15926a) {
            case 0:
                return Boolean.valueOf(this.b.j != null);
            case 1:
                UiEventHandler uiEventHandler = this.b.j;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return Unit.f17538a;
            default:
                UiEventHandler uiEventHandler2 = this.b.j;
                if (uiEventHandler2 != null) {
                    uiEventHandler2.a();
                }
                return Unit.f17538a;
        }
    }
}

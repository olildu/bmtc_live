package defpackage;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUrlUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l31 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18277a;
    public final /* synthetic */ ImageUrlUIState b;

    public /* synthetic */ l31(ImageUrlUIState imageUrlUIState, int i) {
        this.f18277a = i;
        this.b = imageUrlUIState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18277a) {
            case 0:
                return Boolean.valueOf(this.b.c != null);
            default:
                UiEventHandler uiEventHandler = this.b.f;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return Unit.f17538a;
        }
    }
}

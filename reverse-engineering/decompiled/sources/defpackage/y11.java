package defpackage;

import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20067a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ StopTripDetailsUiModel c;

    public /* synthetic */ y11(Function1 function1, StopTripDetailsUiModel stopTripDetailsUiModel, int i) {
        this.f20067a = i;
        this.b = function1;
        this.c = stopTripDetailsUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20067a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
        return Unit.f17538a;
    }
}

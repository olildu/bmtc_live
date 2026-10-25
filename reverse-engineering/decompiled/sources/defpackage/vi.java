package defpackage;

import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkIntent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19838a;
    public final /* synthetic */ ChaloCardLinkCardComponent b;

    public /* synthetic */ vi(ChaloCardLinkCardComponent chaloCardLinkCardComponent, int i) {
        this.f19838a = i;
        this.b = chaloCardLinkCardComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19838a) {
            case 0:
                ChaloCardLinkViewState it = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it, "it");
                ChaloCardLinkCardComponent chaloCardLinkCardComponent = this.b;
                return ChaloCardLinkViewState.a(it, ((ChaloCardLinkViewState) chaloCardLinkCardComponent.f.getValue()).f6279a, ((ChaloCardLinkViewState) chaloCardLinkCardComponent.f.getValue()).b, false, false, CardLinkingErrorType.API_CALL_FAILED, false, "", null, 0, 0, 0, 0, false, 3968);
            case 1:
                ChaloCardLinkViewState it2 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it2, "it");
                ChaloCardLinkCardComponent chaloCardLinkCardComponent2 = this.b;
                return ChaloCardLinkViewState.a(it2, ((ChaloCardLinkViewState) chaloCardLinkCardComponent2.f.getValue()).f6279a, ((ChaloCardLinkViewState) chaloCardLinkCardComponent2.f.getValue()).b, false, false, CardLinkingErrorType.API_CALL_FAILED, false, "", null, 0, 0, 0, 0, false, 3968);
            case 2:
                ChaloCardLinkViewState it3 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it3, "it");
                ChaloCardLinkCardComponent chaloCardLinkCardComponent3 = this.b;
                return ChaloCardLinkViewState.a(it3, ((ChaloCardLinkViewState) chaloCardLinkCardComponent3.f.getValue()).f6279a, ((ChaloCardLinkViewState) chaloCardLinkCardComponent3.f.getValue()).b, false, false, CardLinkingErrorType.API_CALL_FAILED, false, "", null, 0, 0, 0, 0, false, 3968);
            case 3:
                ChaloCardLinkViewState it4 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it4, "it");
                return ChaloCardLinkViewState.a(it4, ((ChaloCardLinkViewState) this.b.f.getValue()).f6279a, "", false, false, CardLinkingErrorType.INVALID_LINK_CODE, false, "", null, 0, 0, 0, 0, false, 3968);
            default:
                ChaloCardLinkIntent it5 = (ChaloCardLinkIntent) obj;
                Intrinsics.i(it5, "it");
                this.b.G0(it5);
                return Unit.f17538a;
        }
    }
}

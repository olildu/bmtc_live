package defpackage;

import app.chalo.constants.Source;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15716a;
    public final /* synthetic */ InstantTicketWalletAccessComponent b;

    public /* synthetic */ gb0(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, int i) {
        this.f15716a = i;
        this.b = instantTicketWalletAccessComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstantTicketWalletAccessState oldState = (InstantTicketWalletAccessState) obj;
        switch (this.f15716a) {
            case 0:
                Intrinsics.i(oldState, "oldState");
                if (oldState.b) {
                    return InstantTicketWalletAccessState.a(oldState, null, false, false, null, null, false, null, null, false, false, null, false, false, 8189);
                }
                this.b.A.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.INSTANT_TICKET, true), null, null, 6));
                return InstantTicketWalletAccessState.a(oldState, null, true, false, null, null, false, null, null, false, false, null, false, false, 8189);
            case 1:
                if (oldState.b) {
                    return InstantTicketWalletAccessState.a(oldState, null, false, false, null, null, false, null, null, false, false, null, false, false, 8189);
                }
                this.b.A.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.INSTANT_TICKET, true), null, null, 6));
                return InstantTicketWalletAccessState.a(oldState, null, true, false, null, null, false, null, null, false, false, null, false, false, 8189);
            default:
                if (oldState.b) {
                    return InstantTicketWalletAccessState.a(oldState, null, false, false, null, null, false, null, null, false, false, null, false, false, 8189);
                }
                this.b.A.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.INSTANT_TICKET, true), null, null, 6));
                return InstantTicketWalletAccessState.a(oldState, null, true, false, null, null, false, null, null, false, false, null, false, false, 8189);
        }
    }
}

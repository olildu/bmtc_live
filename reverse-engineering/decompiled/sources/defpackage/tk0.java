package defpackage;

import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19667a;
    public final /* synthetic */ TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet b;

    public /* synthetic */ tk0(TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet, int i) {
        this.f19667a = i;
        this.b = ticketsPageInfoBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MyTicketsDataState it = (MyTicketsDataState) obj;
        switch (this.f19667a) {
            case 0:
                Intrinsics.i(it, "it");
                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, this.b, null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            default:
                Intrinsics.i(it, "it");
                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, this.b, null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
        }
    }
}

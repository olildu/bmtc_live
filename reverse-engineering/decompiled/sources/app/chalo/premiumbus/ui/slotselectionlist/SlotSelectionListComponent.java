package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.premiumbus.managers.SelectSlotsResult;
import app.chalo.premiumbus.managers.SlotSelectionResultStateManager;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.rw0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListDataState;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewState;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotSelectionListComponent extends ChaloBaseStateMviComponent<SlotSelectionListViewIntent, SlotSelectionListDataState, SlotSelectionListViewState, SlotSelectionListSideEffect> {
    public final ComponentContext k;
    public final StringProvider l;
    public final SlotSelectionResultStateManager m;
    public final TimeUtilsContract n;
    public final ChaloNavigationManager o;
    public final AnalyticsContract p;
    public String q;

    public SlotSelectionListComponent(PremiumBusArgs.PremiumBusSlotListScreenArgs premiumBusSlotListScreenArgs, ComponentContext componentContext, StringProvider stringProvider, SlotSelectionResultStateManager slotSelectionResultStateManager, TimeUtilsContract timeUtilsContract, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = componentContext;
        this.l = stringProvider;
        this.m = slotSelectionResultStateManager;
        this.n = timeUtilsContract;
        this.o = chaloNavigationManager;
        this.p = analyticsContract;
        this.q = "";
        String str = premiumBusSlotListScreenArgs.c;
        Source source = premiumBusSlotListScreenArgs.d;
        Json json = ChaloJson.b;
        String str2 = premiumBusSlotListScreenArgs.e;
        json.getClass();
        G0(new SlotSelectionListViewIntent.InitializationIntent(str, source, (PremiumBusSlotListScreenData) json.b(str2, PremiumBusSlotListScreenData.INSTANCE.serializer())));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x0103  */
    /* JADX WARN: Code duplicated, block: B:26:0x0127  */
    /* JADX WARN: Code duplicated, block: B:29:0x0158  */
    /* JADX WARN: Code duplicated, block: B:31:0x015d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0186  */
    /* JADX WARN: Code duplicated, block: B:38:0x018b  */
    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Code duplicated, block: B:43:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0127 -> B:27:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0174 -> B:34:0x0180). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object p0(app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListDataState r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent.p0(app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void G0(SlotSelectionListViewIntent slotSelectionListViewIntent) {
        String str;
        String str2;
        String strE;
        Object next;
        String str3;
        String str4;
        String strE2;
        C0(slotSelectionListViewIntent);
        boolean z = slotSelectionListViewIntent instanceof SlotSelectionListViewIntent.InitializationIntent;
        TimeUtilsContract timeUtilsContract = this.n;
        String str5 = "";
        if (z) {
            SlotSelectionListViewIntent.InitializationIntent initializationIntent = (SlotSelectionListViewIntent.InitializationIntent) slotSelectionListViewIntent;
            this.q = initializationIntent.f7925a;
            PremiumBusSlotListScreenData premiumBusSlotListScreenData = initializationIntent.c;
            Source source = initializationIntent.b;
            Iterator it = premiumBusSlotListScreenData.f6961a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((SlotsAvailableForSelection) next).b);
            SlotsAvailableForSelection slotsAvailableForSelection = (SlotsAvailableForSelection) next;
            PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel = slotsAvailableForSelection != null ? slotsAvailableForSelection.f7902a : null;
            if (pBBulkBookingAvailableSlotsTripAppResponseModel == null || (str3 = pBBulkBookingAvailableSlotsTripAppResponseModel.f8236a) == null) {
                str3 = "";
            }
            if (pBBulkBookingAvailableSlotsTripAppResponseModel == null || (str4 = pBBulkBookingAvailableSlotsTripAppResponseModel.b) == null) {
                str4 = "";
            }
            Source source2 = Source.SLOT_SELECTION_LIST_SCREEN;
            if (pBBulkBookingAvailableSlotsTripAppResponseModel != null && (strE2 = timeUtilsContract.e(pBBulkBookingAvailableSlotsTripAppResponseModel.c)) != null) {
                str5 = strE2;
            }
            AnalyticsContractImplKt.b(this.p, "pb alternate slot list screen opened", source2, MapsKt.i(new Pair("selectedSlotTime", str5), new Pair("route id", str3), new Pair("tripId", str4)), false, 24);
            BuildersKt.d(this.j, null, null, new SlotSelectionListComponent$handleInitializationIntent$2(this, premiumBusSlotListScreenData, source, null), 3);
            return;
        }
        boolean z2 = slotSelectionListViewIntent instanceof SlotSelectionListViewIntent.OnSlotSelectionClickIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            SlotSelectionListViewIntent.OnSlotSelectionClickIntent onSlotSelectionClickIntent = (SlotSelectionListViewIntent.OnSlotSelectionClickIntent) slotSelectionListViewIntent;
            E0(new rw0(10, onSlotSelectionClickIntent, ((SlotSelectionListDataState) stateFlow.getValue()).b, onSlotSelectionClickIntent.f7926a.f7902a));
            return;
        }
        if (!slotSelectionListViewIntent.equals(SlotSelectionListViewIntent.ConfirmButtonClickIntent.f7924a)) {
            throw new NoWhenBranchMatchedException();
        }
        SlotsAvailableForSelection slotsAvailableForSelection2 = ((SlotSelectionListDataState) stateFlow.getValue()).c;
        if (slotsAvailableForSelection2 == null) {
            return;
        }
        this.m.c(new SelectSlotsResult(slotsAvailableForSelection2), this.q);
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel2 = slotsAvailableForSelection2.f7902a;
        if (pBBulkBookingAvailableSlotsTripAppResponseModel2 == null || (str = pBBulkBookingAvailableSlotsTripAppResponseModel2.f8236a) == null) {
            str = "";
        }
        if (pBBulkBookingAvailableSlotsTripAppResponseModel2 == null || (str2 = pBBulkBookingAvailableSlotsTripAppResponseModel2.b) == null) {
            str2 = "";
        }
        Source source3 = Source.SLOT_SELECTION_LIST_SCREEN;
        if (pBBulkBookingAvailableSlotsTripAppResponseModel2 != null && (strE = timeUtilsContract.e(pBBulkBookingAvailableSlotsTripAppResponseModel2.c)) != null) {
            str5 = strE;
        }
        AnalyticsContractImplKt.b(this.p, "pb alternate slot list screen confirm btn clicked", source3, MapsKt.i(new Pair("selectedSlotTime", str5), new Pair("route id", str), new Pair("tripId", str2)), false, 24);
        gf.u(null, this.o);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SlotSelectionListDataState("", null, null, Source.NONE);
    }
}

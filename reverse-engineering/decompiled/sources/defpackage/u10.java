package defpackage;

import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.home.ui.home.HomePageDisplayItemData;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.TicketsTabHooksCardSectionData;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRoutesDetailModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19706a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u10(int i, String str, EnumDescriptor enumDescriptor) {
        this.f19706a = 0;
        this.b = i;
        this.c = str;
        this.d = enumDescriptor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19706a;
        Unit unit = Unit.f17538a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = SerialDescriptorsKt.f(str + FilenameUtils.EXTENSION_SEPARATOR + enumDescriptor.e[i3], StructureKind.OBJECT.f18120a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            case 1:
                ImageResourceSectionAppModel imageResourceSectionAppModel = (ImageResourceSectionAppModel) obj;
                ((Function1) obj2).invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(null, imageResourceSectionAppModel.g, HomePageFeature.IMAGE_RESOURCE, this.b, imageResourceSectionAppModel.c, imageResourceSectionAppModel.f, 1));
                return unit;
            case 2:
                HomePageDisplayItemData homePageDisplayItemData = (HomePageDisplayItemData) obj2;
                Function1 function1 = (Function1) obj;
                HomePageFeature homePageFeature = homePageDisplayItemData.g;
                switch (homePageFeature == null ? -1 : HomeTabScaffoldKt.WhenMappings.f3580a[homePageFeature.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return unit;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        HomePageFeature homePageFeature2 = homePageDisplayItemData.g;
                        String str2 = homePageDisplayItemData.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        function1.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(null, str2, homePageFeature2, this.b, null, null, 49));
                        return unit;
                }
            case 3:
                return Http2Connection.pushRequestLater$lambda$32((Http2Connection) obj2, i2, (List) obj);
            case 4:
                TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = (TicketsTabHooksCardSectionData) obj;
                ((Function1) obj2).invoke(new MyTicketsViewIntent.TicketsPageItemClickedIntent(ticketsTabHooksCardSectionData, ticketsTabHooksCardSectionData.e, null, String.valueOf(i2), 4));
                return unit;
            case 5:
                float f = RouteDetailsStopsListUIStateFactory.c;
                ((Function1) obj2).invoke(new RouteDetailsIntent.StopSelectedToViewEtasIntent(i2, ((RouteDetailsStopUiModel) obj).f));
                return unit;
            case 6:
                ((Function1) obj2).invoke(new PremiumBusSlotSelectionIntent.SlotClickedIntent((PBAvailableSlotsTripAppModel) obj, i2));
                return unit;
            case 7:
                ((Function2) obj2).invoke(Integer.valueOf(i2), (ImageResourceSectionAppModel) obj);
                return unit;
            default:
                ((Function2) obj2).invoke(((UniversalSearchRoutesDetailModel) obj).f5006a, Integer.valueOf(i2));
                return unit;
        }
    }

    public /* synthetic */ u10(Object obj, int i, Object obj2, int i2) {
        this.f19706a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ u10(Object obj, Object obj2, int i, int i2) {
        this.f19706a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

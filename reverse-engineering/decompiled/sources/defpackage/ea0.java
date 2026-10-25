package defpackage;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import app.chalo.checkout.data.model.app.InstalledUpiApps;
import app.chalo.checkout.data.model.app.InstalledUpiDetailApiModel$$serializer;
import app.chalo.core.database.tableadapters.InstantTicketReceiptTableAdapter;
import app.chalo.core.database.tableadapters.InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1;
import app.chalo.core.database.tableadapters.InstantTicketTableAdapter;
import app.chalo.core.database.tableadapters.InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1;
import app.chalo.data.ChaloTextDataAppModel$$serializer;
import app.chalo.data.InstantTicketFeatureConfigForCity;
import app.chalo.data.InstantTicketFeatureConfigForCity$$serializer;
import app.chalo.data.InstantTicketFeatureRemoteConfig;
import app.chalo.home.data.model.api.ChaloTextDataApiModel$$serializer;
import app.chalo.home.data.model.api.ItemTextDataApiModel;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.instantticket.config.models.InstantTicketConfigurationApiModel;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestApiModel;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestPassengerDetail$$serializer;
import app.chalo.instantticket.data.model.api.response.InstantMobileTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.InstantTicketPassengerDetailsApiModel$$serializer;
import app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import io.github.alexzhirkevich.keight.js.JSNumberFunctionKt;
import io.ktor.util.debug.IntellijIdeaDebugDetector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ea0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15533a;

    public /* synthetic */ ea0(int i) {
        this.f15533a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f15533a) {
            case 0:
                return new BitmapPainter((ImageBitmap) ImageResourcesKt.f18776a.getValue(), 0L, 0L, 6, null);
            case 1:
                return (ImageBitmap) ImageResourcesKt.f18776a.getValue();
            case 2:
                return (Painter) ImageResourcesKt.c.getValue();
            case 3:
                return (ImageVector) ImageResourcesKt.b.getValue();
            case 4:
                return DefaultDebugIndication.INSTANCE;
            case 5:
                return InspectionTablesKt.LocalInspectionTables$lambda$0();
            case 6:
                InstalledUpiApps.Companion companion = InstalledUpiApps.INSTANCE;
                return new ArrayListSerializer(InstalledUpiDetailApiModel$$serializer.f1287a);
            case 7:
                InstantMobileTicketResponseApiModel.Companion companion2 = InstantMobileTicketResponseApiModel.Companion;
                return new ArrayListSerializer(InstantTicketResponseApiModel$$serializer.f3870a);
            case 8:
                InstantTicketConfiguration.Companion companion3 = InstantTicketConfiguration.INSTANCE;
                return new ArrayListSerializer(ProductImageAppModel$$serializer.f8225a);
            case 9:
                InstantTicketConfigurationApiModel.Companion companion4 = InstantTicketConfigurationApiModel.Companion;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 10:
                InstantTicketFeatureConfigForCity.Companion companion5 = InstantTicketFeatureConfigForCity.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 11:
                InstantTicketFeatureRemoteConfig.Companion companion6 = InstantTicketFeatureRemoteConfig.INSTANCE;
                return new ArrayListSerializer(InstantTicketFeatureConfigForCity$$serializer.f2351a);
            case 12:
                InstantTicketOrderRequestApiModel.Companion companion7 = InstantTicketOrderRequestApiModel.INSTANCE;
                return new ArrayListSerializer(InstantTicketOrderRequestPassengerDetail$$serializer.f3856a);
            case 13:
                InstantTicketReceipt.Companion companion8 = InstantTicketReceipt.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 14:
                InstantTicketReceipt.Companion companion9 = InstantTicketReceipt.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 15:
                Lazy lazy = InstantTicketReceiptTableAdapter.f2115a;
                return new InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1();
            case 16:
                InstantTicketResponseApiModel.Companion companion10 = InstantTicketResponseApiModel.Companion;
                return new ArrayListSerializer(InstantTicketPassengerDetailsApiModel$$serializer.f3868a);
            case 17:
                Lazy lazy2 = InstantTicketTableAdapter.f2116a;
                return new InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1();
            case 18:
                return Boolean.valueOf(IntellijIdeaDebugDetector.a());
            case 19:
                return Boolean.valueOf(InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement$lambda$0());
            case 20:
                return InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize$lambda$1();
            case 21:
                ItemTextDataApiModel.Companion companion11 = ItemTextDataApiModel.INSTANCE;
                return new ArrayListSerializer(ChaloTextDataApiModel$$serializer.f2883a);
            case 22:
                ItemTextDataApiModel.Companion companion12 = ItemTextDataApiModel.INSTANCE;
                return new ArrayListSerializer(ChaloTextDataApiModel$$serializer.f2883a);
            case 23:
                ItemTextDataAppModel.Companion companion13 = ItemTextDataAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloTextDataAppModel$$serializer.f2336a);
            case 24:
                ItemTextDataAppModel.Companion companion14 = ItemTextDataAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloTextDataAppModel$$serializer.f2336a);
            case 25:
                return 0;
            case 26:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case 27:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case 28:
                Lazy lazy3 = JSNumberFunctionKt.f16422a;
                IntRange intRange = new IntRange(1, 10, 1);
                ArrayList arrayList = new ArrayList(CollectionsKt.v(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (((IntProgressionIterator) it).getC()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    arrayList.add(new Pair(Integer.valueOf(i), Double.valueOf(Math.pow(10.0d, iNextInt))));
                    i = i2;
                }
                return MapsKt.q(arrayList);
            default:
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
                return JsonPrimitiveSerializer.b;
        }
    }
}

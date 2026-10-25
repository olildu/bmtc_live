package app.chalo.productbooking;

import app.chalo.contract.MetroBookingFlowAvailability;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/ProductBookingHelperImpl;", "Lapp/chalo/contract/ProductBookingHelper;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingHelperImpl implements ProductBookingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f8085a;
    public final OndcRepository b;

    public ProductBookingHelperImpl(OndcRepository ondcRepository, CityProvider cityProvider) {
        this.f8085a = cityProvider;
        this.b = ondcRepository;
    }

    @Override // app.chalo.contract.ProductBookingHelper
    public final MetroBookingFlowType a(String str) {
        String string;
        ArrayList arrayListE;
        Object obj;
        if (str != null && (string = StringsKt.u0(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null && (arrayListE = e()) != null) {
                int size = arrayListE.size();
                int i = 0;
                do {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayListE.get(i);
                    i++;
                } while (!StringsKt.x(((AgencyInfoAppModel) obj).f8852a, string, true));
                AgencyInfoAppModel agencyInfoAppModel = (AgencyInfoAppModel) obj;
                if (agencyInfoAppModel != null) {
                    if (agencyInfoAppModel.i) {
                        return MetroBookingFlowType.ONDC;
                    }
                    if (agencyInfoAppModel.j) {
                        return MetroBookingFlowType.DIRECT;
                    }
                }
            }
        }
        return null;
    }

    @Override // app.chalo.contract.ProductBookingHelper
    public final Object b(OndcTicketReceiptAppModel ondcTicketReceiptAppModel, Continuation continuation) {
        Object objS = this.b.s(ondcTicketReceiptAppModel, (ContinuationImpl) continuation);
        return objS == CoroutineSingletons.COROUTINE_SUSPENDED ? objS : Unit.f17538a;
    }

    @Override // app.chalo.contract.ProductBookingHelper
    public final Boolean c() {
        CityAppModel cityAppModel = (CityAppModel) this.f8085a.getE().getValue();
        boolean z = false;
        if (cityAppModel != null && CityAppModelKt.c(ChaloTransitMode.BUS, cityAppModel)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // app.chalo.contract.ProductBookingHelper
    public final MetroBookingFlowAvailability d() {
        MetroBookingFlowType metroBookingFlowType;
        ArrayList arrayListE = e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                AgencyInfoAppModel agencyInfoAppModel = (AgencyInfoAppModel) obj;
                if (agencyInfoAppModel.i) {
                    metroBookingFlowType = MetroBookingFlowType.ONDC;
                } else {
                    metroBookingFlowType = agencyInfoAppModel.j ? MetroBookingFlowType.DIRECT : null;
                }
                if (metroBookingFlowType != null) {
                    arrayList.add(metroBookingFlowType);
                }
            }
            List listZ = CollectionsKt.z(arrayList);
            if (!listZ.isEmpty()) {
                return new MetroBookingFlowAvailability.Available(listZ);
            }
        }
        return MetroBookingFlowAvailability.FlowNotApplicable.f1949a;
    }

    public final ArrayList e() {
        CityAppModel cityAppModel;
        List list;
        StateFlow e = this.f8085a.getE();
        if (e == null || (cityAppModel = (CityAppModel) e.getValue()) == null || (list = cityAppModel.h) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ModeMapInfoAppModel) obj).f8858a == ChaloTransitMode.METRO) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            CollectionsKt.i(((ModeMapInfoAppModel) obj2).c, arrayList2);
        }
        return arrayList2;
    }
}

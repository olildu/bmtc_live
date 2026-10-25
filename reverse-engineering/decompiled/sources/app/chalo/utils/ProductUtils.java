package app.chalo.utils;

import app.chalo.models.ChaloCardOptions;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/ProductUtils;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetAvailableChaloCardOptionsUseCase f10437a;

    public ProductUtils(GetAvailableChaloCardOptionsUseCase getAvailableChaloCardOptionsUseCase) {
        this.f10437a = getAvailableChaloCardOptionsUseCase;
    }

    public static boolean b(ChaloTransitMode mode, CityAppModel cityAppModel) {
        Intrinsics.i(mode, "mode");
        Iterator it = cityAppModel.h.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            ModeMapInfoAppModel modeMapInfoAppModel = (ModeMapInfoAppModel) it.next();
            if (modeMapInfoAppModel.f8858a == mode) {
                ArrayList arrayList = modeMapInfoAppModel.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((AgencyInfoAppModel) obj).c) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(CityAppModel cityAppModel, ContinuationImpl continuationImpl) {
        ProductUtils$isOldOnlineCardRechargeAvailable$1 productUtils$isOldOnlineCardRechargeAvailable$1;
        if (continuationImpl instanceof ProductUtils$isOldOnlineCardRechargeAvailable$1) {
            productUtils$isOldOnlineCardRechargeAvailable$1 = (ProductUtils$isOldOnlineCardRechargeAvailable$1) continuationImpl;
            int i = productUtils$isOldOnlineCardRechargeAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productUtils$isOldOnlineCardRechargeAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                productUtils$isOldOnlineCardRechargeAvailable$1 = new ProductUtils$isOldOnlineCardRechargeAvailable$1(this, continuationImpl);
            }
        } else {
            productUtils$isOldOnlineCardRechargeAvailable$1 = new ProductUtils$isOldOnlineCardRechargeAvailable$1(this, continuationImpl);
        }
        Object objA = productUtils$isOldOnlineCardRechargeAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productUtils$isOldOnlineCardRechargeAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            for (ModeMapInfoAppModel modeMapInfoAppModel : cityAppModel.h) {
                if (modeMapInfoAppModel.f8858a == ChaloTransitMode.BUS) {
                    ArrayList arrayList = modeMapInfoAppModel.c;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((AgencyInfoAppModel) obj).g) {
                                productUtils$isOldOnlineCardRechargeAvailable$1.label = 1;
                                objA = this.f10437a.a(productUtils$isOldOnlineCardRechargeAvailable$1);
                                if (objA == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        ChaloCardOptions chaloCardOptions = (ChaloCardOptions) objA;
        return Boolean.valueOf(chaloCardOptions == null || chaloCardOptions.f5579a.isEmpty());
    }
}

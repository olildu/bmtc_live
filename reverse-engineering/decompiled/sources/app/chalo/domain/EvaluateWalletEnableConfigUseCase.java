package app.chalo.domain;

import app.chalo.data.ClosedLoopWalletSetupConfig;
import app.chalo.data.WalletEnableConfig;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/EvaluateWalletEnableConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EvaluateWalletEnableConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f2487a;

    public EvaluateWalletEnableConfigUseCase(CityProvider cityProvider) {
        this.f2487a = cityProvider;
    }

    public final WalletEnableConfig a() {
        List<AgencyInfoAppModel> listK = this.f2487a.k(ChaloTransitMode.BUS);
        if (listK == null) {
            listK = EmptyList.f17557a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (AgencyInfoAppModel agencyInfoAppModel : listK) {
            if (agencyInfoAppModel.e) {
                z = true;
            }
            if (agencyInfoAppModel.d) {
                z2 = true;
            }
            arrayList.add(new ClosedLoopWalletSetupConfig(agencyInfoAppModel.f8852a, agencyInfoAppModel.f));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (hashSet.add(((ClosedLoopWalletSetupConfig) obj).f2344a)) {
                arrayList2.add(obj);
            }
        }
        return new WalletEnableConfig(arrayList2, z, z2);
    }
}

package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/CheckAndShowPassPurchaseNudgeCard;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckAndShowPassPurchaseNudgeCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7182a;
    public final CityProvider b;

    public CheckAndShowPassPurchaseNudgeCard(PremiumBusRepository premiumBusRepository, CityProvider cityProvider) {
        this.f7182a = premiumBusRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckAndShowPassPurchaseNudgeCard$invoke$1 checkAndShowPassPurchaseNudgeCard$invoke$1;
        String str;
        if (continuationImpl instanceof CheckAndShowPassPurchaseNudgeCard$invoke$1) {
            checkAndShowPassPurchaseNudgeCard$invoke$1 = (CheckAndShowPassPurchaseNudgeCard$invoke$1) continuationImpl;
            int i = checkAndShowPassPurchaseNudgeCard$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkAndShowPassPurchaseNudgeCard$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkAndShowPassPurchaseNudgeCard$invoke$1 = new CheckAndShowPassPurchaseNudgeCard$invoke$1(this, continuationImpl);
            }
        } else {
            checkAndShowPassPurchaseNudgeCard$invoke$1 = new CheckAndShowPassPurchaseNudgeCard$invoke$1(this, continuationImpl);
        }
        Object objV = checkAndShowPassPurchaseNudgeCard$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkAndShowPassPurchaseNudgeCard$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            CityAppModel cityAppModel = (CityAppModel) this.b.b().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                return Boolean.FALSE;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Flow flowA = PremiumBusRepository.DefaultImpls.a(this.f7182a, lowerCase, null, 6);
            checkAndShowPassPurchaseNudgeCard$invoke$1.label = 1;
            objV = FlowKt.v(flowA, checkAndShowPassPurchaseNudgeCard$invoke$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        List list = (List) objV;
        if (list == null) {
            return Boolean.FALSE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PremiumReserveTicketStatus premiumReserveTicketStatus = ((PremiumReserveTicketAppModel) obj).f7113a.h;
            if (premiumReserveTicketStatus == PremiumReserveTicketStatus.ACTIVE || premiumReserveTicketStatus == PremiumReserveTicketStatus.PUNCHED || premiumReserveTicketStatus == PremiumReserveTicketStatus.USED || premiumReserveTicketStatus == PremiumReserveTicketStatus.EXPIRED) {
                arrayList.add(obj);
            }
        }
        return Boolean.valueOf(arrayList.size() >= 2);
    }
}

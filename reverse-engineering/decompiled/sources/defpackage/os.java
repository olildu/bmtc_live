package defpackage;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseDataState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.PassValidityInfo;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class os implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18974a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ os(SuperPassPurchaseSharedState superPassPurchaseSharedState, Long l, long j, String str, String str2, IconType iconType) {
        this.e = superPassPurchaseSharedState;
        this.f = l;
        this.d = j;
        this.b = str;
        this.c = str2;
        this.g = iconType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        switch (this.f18974a) {
            case 0:
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.e;
                Long l = (Long) this.f;
                IconType iconType = (IconType) this.g;
                ConfirmSuperPassPurchaseDataState it = (ConfirmSuperPassPurchaseDataState) obj;
                Intrinsics.i(it, "it");
                superPassPurchaseSharedState.getClass();
                BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
                return ConfirmSuperPassPurchaseDataState.a(it, true, false, null, null, null, this.b, this.c, iconType, new PassValidityInfo(l, (bookableSuperPassConfiguration == null || (superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c) == null) ? null : Long.valueOf(superPassProductConfigFareMappingResponseAppModel.f - CalendarModelKt.MillisecondsIn24Hours), Long.valueOf(this.d)), null, 1054);
            default:
                PaymentMainComponent paymentMainComponent = (PaymentMainComponent) this.e;
                String str = (String) this.f;
                List list = (List) this.g;
                PaymentDataState it2 = (PaymentDataState) obj;
                Intrinsics.i(it2, "it");
                CurrencyFeature currencyFeature = paymentMainComponent.u;
                long j = Long.parseLong(str);
                CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
                return PaymentDataState.a(it2, null, false, null, false, this.b, this.c, false, currencyFeature.a(j, currencyRoundOffLogic), paymentMainComponent.u.a(this.d, currencyRoundOffLogic), null, list, false, false, false, null, false, null, 2094671);
        }
    }

    public /* synthetic */ os(String str, String str2, PaymentMainComponent paymentMainComponent, String str3, long j, List list) {
        this.b = str;
        this.c = str2;
        this.e = paymentMainComponent;
        this.f = str3;
        this.d = j;
        this.g = list;
    }
}

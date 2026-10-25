package app.chalo.productpurchase.passpurchase.domain;

import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel;
import app.chalo.productpurchase.passpurchase.data.models.api.request.PassProps;
import app.chalo.productpurchase.passpurchase.data.models.api.request.PaymentProps;
import app.chalo.productpurchase.passpurchase.data.models.api.request.UserDetails;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/CreateSuperPassOrderUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateSuperPassOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8328a;
    public final CityProvider b;
    public final TimeUtilsContract c;
    public final IUserPreferencesDataStore d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/CreateSuperPassOrderUseCase$Companion;", "", "", "PAYMENT_ONLINE", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8329a;

        static {
            int[] iArr = new int[SuperPassOrderType.values().length];
            try {
                iArr[SuperPassOrderType.WITHOUT_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassOrderType.POST_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassOrderType.RENEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8329a = iArr;
        }
    }

    public CreateSuperPassOrderUseCase(ProductPurchaseRepository productPurchaseRepository, CityProvider cityProvider, TimeUtilsContract timeUtilsContract, IUserPreferencesDataStore iUserPreferencesDataStore) {
        this.f8328a = productPurchaseRepository;
        this.b = cityProvider;
        this.c = timeUtilsContract;
        this.d = iUserPreferencesDataStore;
    }

    public final CreateSuperPassOrderRequestApiModel a(SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, long j, String str, Map map, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, SuperPassOrderType superPassOrderType, List list, String str2, String str3) {
        String strValueOf = String.valueOf(CityProviderKt.b(this.b));
        UserDetails userDetails = new UserDetails(superPassUserDetails.a(this.c), superPassUserDetails.e, superPassUserDetails.d.get_value(), superPassUserDetails.f, superPassUserDetails.b, superPassUserDetails.f9580a, superPassUserDetails.c);
        String str4 = bookableSuperPassConfiguration.d.f8639a;
        String str5 = bookableSuperPassConfiguration.f5569a;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
        int i = superPassProductConfigFareMappingResponseAppModel.b;
        double d = superPassProductConfigFareMappingResponseAppModel.o.f8646a;
        SuperPassOrderType superPassOrderType2 = SuperPassOrderType.RENEW;
        Map map2 = null;
        PassProps passProps = new PassProps(str4, str5, i, d, j, superPassOrderType == superPassOrderType2 ? Boolean.TRUE : null, superPassOrderType == superPassOrderType2 ? str : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.b : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.f5665a : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.d : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.c : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.e : null);
        int i2 = WhenMappings.f8329a[superPassOrderType.ordinal()];
        if (i2 == 1) {
            map2 = map;
        } else if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentProps paymentProps = new PaymentProps();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(PBRemoteToAppModelMappersKt.a((ApplicableRuleAppModel) it.next()));
        }
        return new CreateSuperPassOrderRequestApiModel(strValueOf, passProps, paymentProps, map2, userDetails, arrayList, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        if (r2 == r13) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.superpass.data.models.entities.SuperPassUserDetails r20, app.chalo.models.BookableSuperPassConfiguration r21, long r22, java.lang.String r24, java.util.HashMap r25, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo r26, app.chalo.productpurchase.passpurchase.domain.SuperPassOrderType r27, java.util.List r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase.b(app.chalo.superpass.data.models.entities.SuperPassUserDetails, app.chalo.models.BookableSuperPassConfiguration, long, java.lang.String, java.util.HashMap, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo, app.chalo.productpurchase.passpurchase.domain.SuperPassOrderType, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

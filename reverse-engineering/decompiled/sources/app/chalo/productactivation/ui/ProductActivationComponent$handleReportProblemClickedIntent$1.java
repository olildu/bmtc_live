package app.chalo.productactivation.ui;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleReportProblemClickedIntent$1", f = "ProductActivationComponent.kt", l = {456}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleReportProblemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductActivationIntent.ReportProblemClickedIntent $intent;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleReportProblemClickedIntent$1(ProductActivationComponent productActivationComponent, ProductActivationIntent.ReportProblemClickedIntent reportProblemClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productActivationComponent;
        this.$intent = reportProblemClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$handleReportProblemClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleReportProblemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IReportProblemFeature iReportProblemFeature;
        String str;
        CoroutineSingletons coroutineSingletons;
        Unit unit;
        HashMap linkedHashMap;
        HashMap map;
        int i;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit2 = Unit.f17538a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit2;
        }
        ResultKt.b(obj);
        ActivationProductData activationProductData = ((ProductActivationDataState) this.this$0.f.getValue()).b;
        if (activationProductData == null) {
            return unit2;
        }
        IReportProblemFeature iReportProblemFeature2 = this.this$0.w;
        String str2 = this.$intent.f8037a;
        if (activationProductData instanceof ActivationProductData.PassActivation) {
            HashMap map2 = new HashMap();
            SuperPass superPass = ((ActivationProductData.PassActivation) activationProductData).f7999a;
            map2.put("userPropertyCity", superPass.f9560a.d);
            SuperPassUserDetails superPassUserDetails = superPass.getC().c;
            map2.put("userPropertyUserName", superPassUserDetails.c);
            map2.put("userPropertyPhoneNo", superPassUserDetails.b);
            map2.put("userPropertyUserID", superPassUserDetails.f9580a);
            SuperPassProperties superPassProperties = superPass.f9560a;
            map2.put("userPropertyAgencyName", superPassProperties.e);
            map2.put("userPropertyMPassId", superPassProperties.f9566a);
            map2.put("userPropertyOrderId", superPass.e.f9573a);
            iReportProblemFeature = iReportProblemFeature2;
            str = str2;
            map = map2;
            coroutineSingletons = coroutineSingletons2;
            unit = unit2;
            i = 1;
        } else {
            if ((activationProductData instanceof ActivationProductData.InstantTicketActivation) || (activationProductData instanceof ActivationProductData.QuickPayActivation)) {
                iReportProblemFeature = iReportProblemFeature2;
                str = str2;
                coroutineSingletons = coroutineSingletons2;
                unit = unit2;
                linkedHashMap = new LinkedHashMap();
            } else if (activationProductData instanceof ActivationProductData.MobileTicketActivation) {
                linkedHashMap = new HashMap();
                MTicket mTicket = ((ActivationProductData.MobileTicketActivation) activationProductData).f7995a;
                String str3 = mTicket.d;
                String str4 = mTicket.x;
                String str5 = mTicket.f5615a;
                iReportProblemFeature = iReportProblemFeature2;
                String str6 = mTicket.e;
                if (str3.length() != 0) {
                    linkedHashMap.put("userPropertyCity", str3);
                }
                UserProfile userProfile = mTicket.o;
                if (userProfile != null) {
                    String str7 = userProfile.b;
                    str = str2;
                    String str8 = userProfile.f5690a;
                    unit = unit2;
                    String str9 = userProfile.g;
                    coroutineSingletons = coroutineSingletons2;
                    linkedHashMap.put("userPropertyUserName", str7 + " " + userProfile.c);
                    if (str9 != null && str9.length() != 0) {
                        linkedHashMap.put("userPropertyPhoneNo", str9);
                    }
                    if (str8 != null) {
                        if (!(str8.length() == 0)) {
                            linkedHashMap.put("userPropertyUserID", str8);
                        }
                    }
                } else {
                    str = str2;
                    coroutineSingletons = coroutineSingletons2;
                    unit = unit2;
                }
                if (str6.length() != 0) {
                    linkedHashMap.put("userPropertyAgencyName", str6);
                }
                RouteStopsInfo routeStopsInfo = mTicket.f;
                if (routeStopsInfo != null) {
                    String str10 = routeStopsInfo.b;
                    String str11 = routeStopsInfo.f1717a;
                    if (str11.length() != 0) {
                        linkedHashMap.put("userPropertyRouteId", str11);
                    }
                    if (str10.length() != 0) {
                        linkedHashMap.put("userPropertyRouteName", str10);
                    }
                }
                if (str5.length() != 0) {
                    linkedHashMap.put("userPropertyMTicketId", str5);
                }
                if (str4 != null && str4.length() != 0) {
                    linkedHashMap.put("userPropertyOrderId", str4);
                }
            } else {
                iReportProblemFeature = iReportProblemFeature2;
                str = str2;
                coroutineSingletons = coroutineSingletons2;
                unit = unit2;
                if (!(activationProductData instanceof ActivationProductData.MetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCTicketActivation) && !(activationProductData instanceof ActivationProductData.PremiumTicketActivation) && !(activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashMap = new LinkedHashMap();
            }
            map = linkedHashMap;
            i = 1;
        }
        this.label = i;
        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
        return iReportProblemFeature.b("transactionRelatedScreen", str, map, false, null, this) == coroutineSingletons3 ? coroutineSingletons3 : unit;
    }
}

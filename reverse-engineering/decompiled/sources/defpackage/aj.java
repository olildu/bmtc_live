package defpackage;

import app.chalo.constants.Source;
import app.chalo.core.Multi_modal_group_ticket_child_table;
import app.chalo.core.Multi_modal_group_ticket_child_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.Post_ride_feedback_tableQueries;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl;
import app.chalo.core.database.dao.PostRideFeedbackDaoImpl;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountErrorType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.productpurchase.passselection.ui.DerivedPassSelectionScreenState;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionDataState;
import app.chalo.productpurchase.passselection.ui.PassSelectionIntent;
import app.chalo.productpurchase.passselection.ui.PassSelectionRestoreState;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenType;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionErrorDialog;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ aj(MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl, String str, List list, List list2, List list3, List list4) {
        this.c = multiModalGroupTicketDaoImpl;
        this.b = str;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        switch (this.f292a) {
            case 0:
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = (ChaloCardRechargeAmountComponent) this.c;
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = (ChaloCardRechargeConfigAppModel) this.e;
                ChaloCardDetails chaloCardDetails = (ChaloCardDetails) this.f;
                CardRechargeAmountLayoutType cardRechargeAmountLayoutType = (CardRechargeAmountLayoutType) this.g;
                String str = (String) this.d;
                ChaloCardRechargeAmountViewState it = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it, "it");
                chaloCardRechargeAmountComponent.o.getClass();
                String str2 = this.b;
                return ChaloCardRechargeAmountViewState.a(it, null, chaloCardRechargeConfigAppModel, chaloCardDetails, str2, GetMaskedCardNoFromCardNoUseCase.a(str2), 0L, "", chaloCardRechargeAmountComponent.l.d(), cardRechargeAmountLayoutType, CardRechargeAmountErrorType.NoError.f6284a, false, false, str, null, null, null, null, false, null, 2072609);
            case 1:
                MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl = (MultiModalGroupTicketDaoImpl) this.c;
                List list = (List) this.d;
                List<MultiModalGroupTicketEntity> list2 = (List) this.e;
                List list3 = (List) this.f;
                List list4 = (List) this.g;
                Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries = multiModalGroupTicketDaoImpl.f2055a;
                Multi_modal_group_ticket_child_tableQueries multi_modal_group_ticket_child_tableQueries = multiModalGroupTicketDaoImpl.b;
                List list5 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list5.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String userId = this.b;
                    if (!zHasNext) {
                        multiModalGroupTicketDaoImpl.j(arrayList);
                        if (!arrayList.isEmpty()) {
                            multi_modal_group_ticket_child_tableQueries.W(arrayList);
                        }
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            String lowerCase = ((String) it3.next()).toLowerCase(Locale.ROOT);
                            Intrinsics.h(lowerCase, "toLowerCase(...)");
                            multi_modal_group_ticket_tableQueries.getClass();
                            Intrinsics.i(userId, "userId");
                            multi_modal_group_ticket_tableQueries.f697a.A0(2021671437, "DELETE FROM multi_modal_group_ticket_table\nWHERE userId = ? AND city = ?", new gw(userId, lowerCase, 2));
                            multi_modal_group_ticket_tableQueries.T(2021671437, new lj0(21));
                        }
                        for (MultiModalGroupTicketEntity multiModalGroupTicketEntity : list2) {
                            for (MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity : multiModalGroupTicketEntity.s) {
                                multi_modal_group_ticket_child_tableQueries.a0(new Multi_modal_group_ticket_child_table(multiModalGroupTicketChildEntity.f5791a, multiModalGroupTicketChildEntity.c, multiModalGroupTicketChildEntity.d, multiModalGroupTicketChildEntity.e, multiModalGroupTicketChildEntity.b));
                            }
                            multiModalGroupTicketDaoImpl.f2055a.Z(MultiModalGroupTicketDaoImpl.i(multiModalGroupTicketDaoImpl, multiModalGroupTicketEntity));
                        }
                        if (!list2.isEmpty()) {
                            MultiModalGroupTicketDaoImpl.h(multiModalGroupTicketDaoImpl, list3, list4);
                        }
                        return Unit.f17538a;
                    }
                    String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    CollectionsKt.i(multi_modal_group_ticket_tableQueries.X(userId, lowerCase2).b(), arrayList);
                }
                break;
            case 2:
                PassSelectionComponent passSelectionComponent = (PassSelectionComponent) this.c;
                PassSelectionIntent.InitializationIntent initializationIntent = (PassSelectionIntent.InitializationIntent) this.d;
                ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) this.e;
                DerivedPassSelectionScreenState derivedPassSelectionScreenState = (DerivedPassSelectionScreenState) this.f;
                Source source = (Source) this.g;
                PassSelectionDataState passSelectionDataState = (PassSelectionDataState) obj;
                PassSelectionRestoreState passSelectionRestoreState = passSelectionComponent.t;
                if (passSelectionRestoreState == null || (superPassPurchaseStopsInfo = passSelectionRestoreState.c) == null) {
                    superPassPurchaseStopsInfo = initializationIntent.d;
                }
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo;
                if (passSelectionRestoreState == null || (postPassPurchaseSuccessFlowType = passSelectionRestoreState.d) == null) {
                    postPassPurchaseSuccessFlowType = initializationIntent.e;
                }
                PostPassPurchaseSuccessFlowType postSuccessFlow = postPassPurchaseSuccessFlowType;
                HashMap map = derivedPassSelectionScreenState.f8524a;
                LinkedHashMap linkedHashMap = derivedPassSelectionScreenState.b;
                PassSelectionScreenType passSelectionScreenType = derivedPassSelectionScreenState.c;
                boolean z = initializationIntent.f;
                passSelectionDataState.getClass();
                String productId = this.b;
                Intrinsics.i(productId, "productId");
                Intrinsics.i(postSuccessFlow, "postSuccessFlow");
                return new PassSelectionDataState(productId, source, superPassPurchaseStopsInfo2, postSuccessFlow, (ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel, map, linkedHashMap, passSelectionScreenType, z);
            case 3:
                List<String> list6 = (List) this.c;
                PostRideFeedbackDaoImpl postRideFeedbackDaoImpl = (PostRideFeedbackDaoImpl) this.e;
                String productSubType = (String) this.d;
                String userId2 = (String) this.f;
                String cityId = (String) this.g;
                for (String bookingId : list6) {
                    Post_ride_feedback_tableQueries post_ride_feedback_tableQueries = postRideFeedbackDaoImpl.f2066a;
                    post_ride_feedback_tableQueries.getClass();
                    Intrinsics.i(bookingId, "bookingId");
                    String productType = this.b;
                    Intrinsics.i(productType, "productType");
                    Intrinsics.i(productSubType, "productSubType");
                    Intrinsics.i(userId2, "userId");
                    Intrinsics.i(cityId, "cityId");
                    post_ride_feedback_tableQueries.f697a.A0(1311657634, "DELETE FROM post_ride_feedback_table WHERE bookingId = ? AND productType = ? AND productSubType = ? AND userId = ? AND cityId = ?", new o3(bookingId, productType, productSubType, userId2, cityId, 8));
                    post_ride_feedback_tableQueries.T(1311657634, new ir0(26));
                }
                return Unit.f17538a;
            default:
                String str3 = (String) this.d;
                String str4 = (String) this.c;
                Function0 function0 = (Function0) this.e;
                String str5 = (String) this.f;
                Function0 function1 = (Function0) this.g;
                ProductSelectionDataState it4 = (ProductSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return ProductSelectionDataState.a(it4, null, false, false, null, new ProductSelectionErrorDialog.RecentMTicketError(this.b, str3, str4, str5, function0, function1), false, null, null, null, 991);
        }
    }

    public /* synthetic */ aj(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, String str, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, ChaloCardDetails chaloCardDetails, CardRechargeAmountLayoutType cardRechargeAmountLayoutType, String str2) {
        this.c = chaloCardRechargeAmountComponent;
        this.b = str;
        this.e = chaloCardRechargeConfigAppModel;
        this.f = chaloCardDetails;
        this.g = cardRechargeAmountLayoutType;
        this.d = str2;
    }

    public /* synthetic */ aj(PassSelectionComponent passSelectionComponent, PassSelectionIntent.InitializationIntent initializationIntent, ProductConfigResponseAppModel productConfigResponseAppModel, DerivedPassSelectionScreenState derivedPassSelectionScreenState, String str, Source source) {
        this.c = passSelectionComponent;
        this.d = initializationIntent;
        this.e = productConfigResponseAppModel;
        this.f = derivedPassSelectionScreenState;
        this.b = str;
        this.g = source;
    }

    public /* synthetic */ aj(String str, String str2, String str3, String str4, Function0 function0, Function0 function1) {
        this.b = str;
        this.d = str2;
        this.c = str3;
        this.e = function0;
        this.f = str4;
        this.g = function1;
    }

    public /* synthetic */ aj(List list, PostRideFeedbackDaoImpl postRideFeedbackDaoImpl, String str, String str2, String str3, String str4) {
        this.c = list;
        this.e = postRideFeedbackDaoImpl;
        this.b = str;
        this.d = str2;
        this.f = str3;
        this.g = str4;
    }
}

package app.chalo.multimodalticket.groupticketsummary.ui;

import app.chalo.constants.Source;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.domain.CreateGroupTicketOrderUseCase;
import app.chalo.multimodalticket.domain.GetGroupTicketSummaryUseCase;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryUIStateFactory;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryViewState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.e40;
import defpackage.u60;
import defpackage.yg;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryDataState;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketSummaryViewState;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummarySideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSummaryComponent extends ChaloBaseStateMviComponent<GroupTicketSummaryViewIntent, GroupTicketSummaryDataState, GroupTicketSummaryViewState, GroupTicketSummarySideEffect> {
    public final GetGroupTicketSummaryUseCase k;
    public final CreateGroupTicketOrderUseCase l;
    public final GroupTicketSummaryUIStateFactory m;
    public final StringProvider n;
    public final KotlinToastManager o;
    public final ChaloNavigationManager p;
    public final UserProfileDetailsProvider q;
    public final TimeUtilsContract r;
    public boolean s;
    public boolean t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion;", "", "ScreenDataValidity", "InvalidScreenArgType", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$InvalidScreenArgType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_JOURNEY_CONFIG_ID", "INVALID_TRANSACTION_ID", "INVALID_AGENCY", "INVALID_LEGS_COUNT", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum InvalidScreenArgType {
            INVALID_JOURNEY_CONFIG_ID,
            INVALID_TRANSACTION_ID,
            INVALID_AGENCY,
            INVALID_LEGS_COUNT;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

            public static EnumEntries<InvalidScreenArgType> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity;", "", "Valid", "Invalid", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity$Invalid;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity$Valid;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ScreenDataValidity {

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity$Invalid;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Invalid extends ScreenDataValidity {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InvalidScreenArgType f5900a;

                public Invalid(InvalidScreenArgType invalidScreenArgType) {
                    this.f5900a = invalidScreenArgType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Invalid) && this.f5900a == ((Invalid) obj).f5900a;
                }

                public final int hashCode() {
                    return this.f5900a.hashCode();
                }

                public final String toString() {
                    return "Invalid(invalidType=" + this.f5900a + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity$Valid;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryComponent$Companion$ScreenDataValidity;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Valid extends ScreenDataValidity {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Valid f5901a = new Valid();
            }
        }
    }

    public GroupTicketSummaryComponent(ComponentContext componentContext, GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, GetGroupTicketSummaryUseCase getGroupTicketSummaryUseCase, CreateGroupTicketOrderUseCase createGroupTicketOrderUseCase, GroupTicketSummaryUIStateFactory groupTicketSummaryUIStateFactory, StringProvider stringProvider, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract) {
        super(componentContext);
        this.k = getGroupTicketSummaryUseCase;
        this.l = createGroupTicketOrderUseCase;
        this.m = groupTicketSummaryUIStateFactory;
        this.n = stringProvider;
        this.o = kotlinToastManager;
        this.p = chaloNavigationManager;
        this.q = userProfileDetailsProvider;
        this.r = timeUtilsContract;
        H0(new GroupTicketSummaryViewIntent.InitialisationIntent(groupTicketBookingSummaryArgs));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object F0(GroupTicketSummaryComponent groupTicketSummaryComponent, ContinuationImpl continuationImpl) {
        GroupTicketSummaryComponent$createOrder$1 groupTicketSummaryComponent$createOrder$1;
        GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs;
        ChaloUseCaseResult chaloUseCaseResult;
        String str;
        UserProfileAppModel userProfileAppModel;
        String str2;
        String str3;
        OrderBookingInfoAppModel orderBookingInfoAppModel;
        String str4;
        String strA;
        Long l;
        String str5;
        String str6;
        StringProvider stringProvider = groupTicketSummaryComponent.n;
        KotlinToastManager kotlinToastManager = groupTicketSummaryComponent.o;
        StateFlow stateFlow = groupTicketSummaryComponent.f;
        if (continuationImpl instanceof GroupTicketSummaryComponent$createOrder$1) {
            groupTicketSummaryComponent$createOrder$1 = (GroupTicketSummaryComponent$createOrder$1) continuationImpl;
            int i = groupTicketSummaryComponent$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSummaryComponent$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSummaryComponent$createOrder$1 = new GroupTicketSummaryComponent$createOrder$1(groupTicketSummaryComponent, continuationImpl);
            }
        } else {
            groupTicketSummaryComponent$createOrder$1 = new GroupTicketSummaryComponent$createOrder$1(groupTicketSummaryComponent, continuationImpl);
        }
        Object objB = groupTicketSummaryComponent$createOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSummaryComponent$createOrder$1.label;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs2 = ((GroupTicketSummaryDataState) stateFlow.getValue()).b;
                GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel = ((GroupTicketSummaryDataState) stateFlow.getValue()).c;
                if (groupTicketSummaryResponseAppModel == null) {
                    groupTicketSummaryComponent.t = false;
                    groupTicketSummaryComponent.E0(new u60(3));
                    return unit;
                }
                groupTicketSummaryComponent.E0(new u60(4));
                CreateGroupTicketOrderUseCase createGroupTicketOrderUseCase = groupTicketSummaryComponent.l;
                groupTicketSummaryComponent$createOrder$1.L$0 = groupTicketBookingSummaryArgs2;
                groupTicketSummaryComponent$createOrder$1.label = 1;
                Object objA = createGroupTicketOrderUseCase.a(groupTicketBookingSummaryArgs2, groupTicketSummaryResponseAppModel, groupTicketSummaryComponent$createOrder$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                groupTicketBookingSummaryArgs = groupTicketBookingSummaryArgs2;
                objB = objA;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        chaloUseCaseResult = (ChaloUseCaseResult) groupTicketSummaryComponent$createOrder$1.L$1;
                        groupTicketBookingSummaryArgs = (GroupTicketBookingSummaryArgs) groupTicketSummaryComponent$createOrder$1.L$0;
                        ResultKt.b(objB);
                        userProfileAppModel = (UserProfileAppModel) objB;
                        groupTicketSummaryComponent.E0(new u60(5));
                        CreateOrderResponseAppModel createOrderResponseAppModel = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        String str7 = groupTicketBookingSummaryArgs.g;
                        if (userProfileAppModel != null || (str6 = userProfileAppModel.i) == null) {
                            str2 = "";
                        } else {
                            str2 = str6;
                        }
                        if (userProfileAppModel != null || (str5 = userProfileAppModel.e) == null) {
                            str3 = "";
                        } else {
                            str3 = str5;
                        }
                        orderBookingInfoAppModel = ((CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).c;
                        if (orderBookingInfoAppModel != null || (l = orderBookingInfoAppModel.f5642a) == null) {
                            str4 = "";
                        } else {
                            String strQ = groupTicketSummaryComponent.r.Q(l.longValue());
                            if (strQ == null) {
                                str4 = "";
                            } else {
                                str4 = strQ;
                            }
                        }
                        CheckoutIntentModel checkoutIntentModelB = CheckoutIntentModelHelperKt.b(createOrderResponseAppModel, str7, str2, str3, str4, Source.GROUP_TICKET_SUMMARY_SCREEN.getSourceName());
                        try {
                            Json json = ChaloJson.b;
                            json.getClass();
                            strA = json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModelB);
                        } catch (Exception unused) {
                            strA = null;
                        }
                        if (strA != null || strA.length() == 0) {
                            groupTicketSummaryComponent$createOrder$1.L$0 = kotlinToastManager;
                            groupTicketSummaryComponent$createOrder$1.L$1 = null;
                            groupTicketSummaryComponent$createOrder$1.label = 3;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], groupTicketSummaryComponent$createOrder$1);
                            if (objB == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            groupTicketSummaryComponent.p.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(KUUID.a(), strA), null, null, 6));
                        }
                        groupTicketSummaryComponent.t = false;
                        groupTicketSummaryComponent.E0(new u60(3));
                        return unit;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(objB);
                        str = (String) objB;
                        KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
                        groupTicketSummaryComponent.t = false;
                        groupTicketSummaryComponent.E0(new u60(3));
                        return unit;
                    }
                    kotlinToastManager = (KotlinToastManager) groupTicketSummaryComponent$createOrder$1.L$0;
                    ResultKt.b(objB);
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                    groupTicketSummaryComponent.t = false;
                    groupTicketSummaryComponent.E0(new u60(3));
                    return unit;
                }
                GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs3 = (GroupTicketBookingSummaryArgs) groupTicketSummaryComponent$createOrder$1.L$0;
                ResultKt.b(objB);
                groupTicketBookingSummaryArgs = groupTicketBookingSummaryArgs3;
            }
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f8097a;
                if (str == null) {
                    groupTicketSummaryComponent$createOrder$1.L$0 = null;
                    groupTicketSummaryComponent$createOrder$1.label = 4;
                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], groupTicketSummaryComponent$createOrder$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = (String) objB;
                }
                KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
                groupTicketSummaryComponent.t = false;
                groupTicketSummaryComponent.E0(new u60(3));
                return unit;
            }
            UserProfileDetailsProvider userProfileDetailsProvider = groupTicketSummaryComponent.q;
            groupTicketSummaryComponent$createOrder$1.L$0 = groupTicketBookingSummaryArgs;
            groupTicketSummaryComponent$createOrder$1.L$1 = chaloUseCaseResult;
            groupTicketSummaryComponent$createOrder$1.label = 2;
            objB = userProfileDetailsProvider.l(groupTicketSummaryComponent$createOrder$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            userProfileAppModel = (UserProfileAppModel) objB;
            groupTicketSummaryComponent.E0(new u60(5));
            CreateOrderResponseAppModel createOrderResponseAppModel2 = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            String str8 = groupTicketBookingSummaryArgs.g;
            if (userProfileAppModel != null) {
                str2 = "";
            } else {
                str2 = "";
            }
            if (userProfileAppModel != null) {
                str3 = "";
            } else {
                str3 = "";
            }
            orderBookingInfoAppModel = ((CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).c;
            if (orderBookingInfoAppModel != null) {
                str4 = "";
            } else {
                str4 = "";
            }
            CheckoutIntentModel checkoutIntentModelB2 = CheckoutIntentModelHelperKt.b(createOrderResponseAppModel2, str8, str2, str3, str4, Source.GROUP_TICKET_SUMMARY_SCREEN.getSourceName());
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA = json2.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModelB2);
            if (strA != null) {
            }
            groupTicketSummaryComponent$createOrder$1.L$0 = kotlinToastManager;
            groupTicketSummaryComponent$createOrder$1.L$1 = null;
            groupTicketSummaryComponent$createOrder$1.label = 3;
            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], groupTicketSummaryComponent$createOrder$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            groupTicketSummaryComponent.t = false;
            groupTicketSummaryComponent.E0(new u60(3));
            return unit;
        } catch (Throwable th) {
            groupTicketSummaryComponent.t = false;
            groupTicketSummaryComponent.E0(new u60(3));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(GroupTicketSummaryComponent groupTicketSummaryComponent, ContinuationImpl continuationImpl) {
        GroupTicketSummaryComponent$fetchPriceDetails$1 groupTicketSummaryComponent$fetchPriceDetails$1;
        groupTicketSummaryComponent.getClass();
        if (continuationImpl instanceof GroupTicketSummaryComponent$fetchPriceDetails$1) {
            groupTicketSummaryComponent$fetchPriceDetails$1 = (GroupTicketSummaryComponent$fetchPriceDetails$1) continuationImpl;
            int i = groupTicketSummaryComponent$fetchPriceDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketSummaryComponent$fetchPriceDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketSummaryComponent$fetchPriceDetails$1 = new GroupTicketSummaryComponent$fetchPriceDetails$1(groupTicketSummaryComponent, continuationImpl);
            }
        } else {
            groupTicketSummaryComponent$fetchPriceDetails$1 = new GroupTicketSummaryComponent$fetchPriceDetails$1(groupTicketSummaryComponent, continuationImpl);
        }
        Object objA = groupTicketSummaryComponent$fetchPriceDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketSummaryComponent$fetchPriceDetails$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs = ((GroupTicketSummaryDataState) groupTicketSummaryComponent.f.getValue()).b;
                groupTicketSummaryComponent.E0(new u60(9));
                GetGroupTicketSummaryUseCase getGroupTicketSummaryUseCase = groupTicketSummaryComponent.k;
                groupTicketSummaryComponent$fetchPriceDetails$1.label = 1;
                objA = getGroupTicketSummaryUseCase.a(groupTicketBookingSummaryArgs, groupTicketSummaryComponent$fetchPriceDetails$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                groupTicketSummaryComponent.E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 9));
            } else {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                groupTicketSummaryComponent.E0(new u60(10));
            }
            groupTicketSummaryComponent.s = false;
            return Unit.f17538a;
        } catch (Throwable th) {
            groupTicketSummaryComponent.s = false;
            throw th;
        }
    }

    public final void H0(GroupTicketSummaryViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof GroupTicketSummaryViewIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new GroupTicketSummaryComponent$handleInitialisationIntent$1(this, (GroupTicketSummaryViewIntent.InitialisationIntent) intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(GroupTicketSummaryViewIntent.OnBackButtonClicked.f5904a);
        ChaloNavigationManager chaloNavigationManager = this.p;
        if (zEquals) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent.equals(GroupTicketSummaryViewIntent.OnRetryPriceDetailsFetchClicked.f5908a)) {
            if (this.s) {
                return;
            }
            this.s = true;
            BuildersKt.d(contextScope, null, null, new GroupTicketSummaryComponent$startFetchPriceDetails$1(this, null), 3);
            return;
        }
        if (intent.equals(GroupTicketSummaryViewIntent.OnTermsAndConditionsClicked.f5909a)) {
            E0(new u60(6));
            return;
        }
        if (intent.equals(GroupTicketSummaryViewIntent.TnCAcceptClickIntent.f5911a)) {
            E0(new u60(7));
            return;
        }
        if (intent.equals(GroupTicketSummaryViewIntent.OnPayButtonClicked.f5907a)) {
            if (this.t) {
                return;
            }
            this.t = true;
            BuildersKt.d(contextScope, null, null, new GroupTicketSummaryComponent$startCreateOrder$1(this, null), 3);
            return;
        }
        if (intent.equals(GroupTicketSummaryViewIntent.OnTripDetailsToggleClicked.f5910a)) {
            E0(new u60(8));
        } else if (intent.equals(GroupTicketSummaryViewIntent.OnEditTicketsClicked.f5905a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            if (!(intent instanceof GroupTicketSummaryViewIntent.OnLegFareRowClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new e40(intent, 5));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        GroupTicketSummaryComponent$convertToUiState$2 groupTicketSummaryComponent$convertToUiState$2 = new GroupTicketSummaryComponent$convertToUiState$2(1, this, GroupTicketSummaryComponent.class, "processIntent", "processIntent(Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;)V", 0);
        return this.m.a((GroupTicketSummaryDataState) obj, groupTicketSummaryComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new GroupTicketSummaryDataState(emptyList, new GroupTicketBookingSummaryArgs("", "", emptyList, emptyList, emptyList, ""), null, EmptySet.f17559a, false, false, false, false, false);
    }
}

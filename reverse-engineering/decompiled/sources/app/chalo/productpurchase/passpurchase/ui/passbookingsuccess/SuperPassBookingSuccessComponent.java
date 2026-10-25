package app.chalo.productpurchase.passpurchase.ui.passbookingsuccess;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIStateKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.of1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassBookingSuccessComponent extends ChaloBaseStateMviComponent<SuperPassBookingSuccessIntent, SuperPassBookingSuccessDataState, SuperPassBookingSuccessUIState, SuperPassBookingSuccessEffect> {
    public final ComponentContext k;
    public final AnalyticsContract l;
    public final BasicInfoContract m;
    public final ChaloNavigationManager n;
    public final StringProvider o;
    public final SystemHelper p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8434a;

        static {
            int[] iArr = new int[SuperPassSubType.values().length];
            try {
                iArr[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8434a = iArr;
        }
    }

    public SuperPassBookingSuccessComponent(SuperPassBookingSuccessArgs superPassBookingSuccessArgs, ComponentContext componentContext, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, SystemHelper systemHelper) {
        super(componentContext);
        this.k = componentContext;
        this.l = analyticsContract;
        this.m = basicInfoContract;
        this.n = chaloNavigationManager;
        this.o = stringProvider;
        this.p = systemHelper;
        I0(new SuperPassBookingSuccessIntent.InitializationIntent(superPassBookingSuccessArgs));
    }

    public static /* synthetic */ void K0(SuperPassBookingSuccessComponent superPassBookingSuccessComponent, String str) {
        superPassBookingSuccessComponent.J0(str, new LinkedHashMap());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0112  */
    /* JADX WARN: Code duplicated, block: B:30:0x0125  */
    /* JADX WARN: Code duplicated, block: B:32:0x0152  */
    /* JADX WARN: Code duplicated, block: B:35:0x0159  */
    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0203  */
    /* JADX WARN: Code duplicated, block: B:65:0x022b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(SuperPassBookingSuccessDataState superPassBookingSuccessDataState, ContinuationImpl continuationImpl) {
        SuperPassBookingSuccessComponent$convertToUiState$1 superPassBookingSuccessComponent$convertToUiState$1;
        SuperPassBookingSuccessDataState superPassBookingSuccessDataState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState chaloTextUIState2;
        TextUIState textUIState;
        SuperPassBookingSuccessDataState superPassBookingSuccessDataState3;
        SuperPassBookingSuccessDataState superPassBookingSuccessDataState4;
        TextUIState textUIState2;
        StringProvider stringProvider;
        String str;
        of1 of1Var;
        Object objB;
        String str2;
        StringProvider stringProvider2;
        Function0 function0;
        Object objB2;
        String str3;
        String str4;
        String str5;
        TextUIState textUIState3;
        Function0 function1;
        TextUIState textUIState4;
        StringProvider stringProvider3;
        of1 of1Var2;
        Object objH0;
        TextUIState textUIState5;
        TextUIState textUIState6;
        Function0 function2;
        String str6;
        String str7;
        Function0 function3;
        TextUIState textUIState7;
        TextUIState textUIState8;
        if (continuationImpl instanceof SuperPassBookingSuccessComponent$convertToUiState$1) {
            superPassBookingSuccessComponent$convertToUiState$1 = (SuperPassBookingSuccessComponent$convertToUiState$1) continuationImpl;
            int i = superPassBookingSuccessComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassBookingSuccessComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassBookingSuccessComponent$convertToUiState$1 = new SuperPassBookingSuccessComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            superPassBookingSuccessComponent$convertToUiState$1 = new SuperPassBookingSuccessComponent$convertToUiState$1(this, continuationImpl);
        }
        SuperPassBookingSuccessComponent$convertToUiState$1 superPassBookingSuccessComponent$convertToUiState$2 = superPassBookingSuccessComponent$convertToUiState$1;
        Object objB3 = superPassBookingSuccessComponent$convertToUiState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassBookingSuccessComponent$convertToUiState$2.label;
        StringProvider stringProvider4 = this.o;
        switch (i2) {
            case 0:
                ResultKt.b(objB3);
                superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState;
                superPassBookingSuccessComponent$convertToUiState$2.label = 1;
                objB3 = stringProvider4.b(StringEnum.BOOKING_SUCCESSFUL, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                if (objB3 != obj) {
                    superPassBookingSuccessDataState2 = superPassBookingSuccessDataState;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                    if (superPassBookingSuccessDataState2.d) {
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState2;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 2;
                        objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                        if (objB3 != obj) {
                            superPassBookingSuccessDataState4 = superPassBookingSuccessDataState2;
                            textUIState2 = chaloTextUIState;
                            superPassBookingSuccessDataState3 = superPassBookingSuccessDataState4;
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.ViewScheduleColor.f9869a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new of1(this, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                            textUIState = textUIState2;
                            if (superPassBookingSuccessDataState3.d) {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 3;
                                objB3 = stringProvider4.b(StringEnum.USE_TICKET, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB3 != obj) {
                                    stringProvider = stringProvider4;
                                    str = (String) objB3;
                                    of1Var = new of1(this, 1);
                                    if (superPassBookingSuccessDataState3.d) {
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                        objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB2 != obj) {
                                            str2 = str;
                                            objB3 = objB2;
                                            stringProvider2 = stringProvider;
                                            function0 = of1Var;
                                            str3 = (String) objB3;
                                            str4 = str2;
                                            str5 = str3;
                                            textUIState3 = chaloTextUIState2;
                                            StringProvider stringProvider5 = stringProvider2;
                                            function1 = function0;
                                            textUIState4 = textUIState;
                                            stringProvider3 = stringProvider5;
                                            of1Var2 = new of1(this, 2);
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                            objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objH0 != obj) {
                                                textUIState5 = textUIState3;
                                                objB3 = objH0;
                                                textUIState6 = textUIState4;
                                                function2 = function1;
                                                str6 = str5;
                                                str7 = str4;
                                                function3 = of1Var2;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                                objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                                if (objB3 != obj) {
                                                    textUIState7 = textUIState5;
                                                    textUIState8 = textUIState6;
                                                    return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                                }
                                            }
                                        }
                                    } else {
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                        objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB != obj) {
                                            str2 = str;
                                            objB3 = objB;
                                            stringProvider2 = stringProvider;
                                            function0 = of1Var;
                                            str3 = (String) objB3;
                                            str4 = str2;
                                            str5 = str3;
                                            textUIState3 = chaloTextUIState2;
                                            StringProvider stringProvider6 = stringProvider2;
                                            function1 = function0;
                                            textUIState4 = textUIState;
                                            stringProvider3 = stringProvider6;
                                            of1Var2 = new of1(this, 2);
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                            objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objH0 != obj) {
                                                textUIState5 = textUIState3;
                                                objB3 = objH0;
                                                textUIState6 = textUIState4;
                                                function2 = function1;
                                                str6 = str5;
                                                str7 = str4;
                                                function3 = of1Var2;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                                objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                                if (objB3 != obj) {
                                                    textUIState7 = textUIState5;
                                                    textUIState8 = textUIState6;
                                                    return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 4;
                                objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB3 != obj) {
                                    stringProvider = stringProvider4;
                                    str = (String) objB3;
                                    of1Var = new of1(this, 1);
                                    if (superPassBookingSuccessDataState3.d) {
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                        objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB2 != obj) {
                                            str2 = str;
                                            objB3 = objB2;
                                            stringProvider2 = stringProvider;
                                            function0 = of1Var;
                                            str3 = (String) objB3;
                                            str4 = str2;
                                            str5 = str3;
                                            textUIState3 = chaloTextUIState2;
                                            StringProvider stringProvider7 = stringProvider2;
                                            function1 = function0;
                                            textUIState4 = textUIState;
                                            stringProvider3 = stringProvider7;
                                            of1Var2 = new of1(this, 2);
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                            objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objH0 != obj) {
                                                textUIState5 = textUIState3;
                                                objB3 = objH0;
                                                textUIState6 = textUIState4;
                                                function2 = function1;
                                                str6 = str5;
                                                str7 = str4;
                                                function3 = of1Var2;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                                objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                                if (objB3 != obj) {
                                                    textUIState7 = textUIState5;
                                                    textUIState8 = textUIState6;
                                                    return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                                }
                                            }
                                        }
                                    } else {
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                        objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB != obj) {
                                            str2 = str;
                                            objB3 = objB;
                                            stringProvider2 = stringProvider;
                                            function0 = of1Var;
                                            str3 = (String) objB3;
                                            str4 = str2;
                                            str5 = str3;
                                            textUIState3 = chaloTextUIState2;
                                            StringProvider stringProvider8 = stringProvider2;
                                            function1 = function0;
                                            textUIState4 = textUIState;
                                            stringProvider3 = stringProvider8;
                                            of1Var2 = new of1(this, 2);
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                            objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objH0 != obj) {
                                                textUIState5 = textUIState3;
                                                objB3 = objH0;
                                                textUIState6 = textUIState4;
                                                function2 = function1;
                                                str6 = str5;
                                                str7 = str4;
                                                function3 = of1Var2;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                                superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                                objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                                if (objB3 != obj) {
                                                    textUIState7 = textUIState5;
                                                    textUIState8 = textUIState6;
                                                    return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        chaloTextUIState2 = null;
                        textUIState = chaloTextUIState;
                        superPassBookingSuccessDataState3 = superPassBookingSuccessDataState2;
                        if (superPassBookingSuccessDataState3.d) {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 3;
                            objB3 = stringProvider4.b(StringEnum.USE_TICKET, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                stringProvider = stringProvider4;
                                str = (String) objB3;
                                of1Var = new of1(this, 1);
                                if (superPassBookingSuccessDataState3.d) {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB2 != obj) {
                                        str2 = str;
                                        objB3 = objB2;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider9 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider9;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                } else {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB != obj) {
                                        str2 = str;
                                        objB3 = objB;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider10 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider10;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 4;
                            objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                stringProvider = stringProvider4;
                                str = (String) objB3;
                                of1Var = new of1(this, 1);
                                if (superPassBookingSuccessDataState3.d) {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB2 != obj) {
                                        str2 = str;
                                        objB3 = objB2;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider11 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider11;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                } else {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB != obj) {
                                        str2 = str;
                                        objB3 = objB;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider12 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider12;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                superPassBookingSuccessDataState2 = (SuperPassBookingSuccessDataState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                if (superPassBookingSuccessDataState2.d) {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 2;
                    objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB3 != obj) {
                        superPassBookingSuccessDataState4 = superPassBookingSuccessDataState2;
                        textUIState2 = chaloTextUIState;
                        superPassBookingSuccessDataState3 = superPassBookingSuccessDataState4;
                        chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.ViewScheduleColor.f9869a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new of1(this, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                        textUIState = textUIState2;
                        if (superPassBookingSuccessDataState3.d) {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 3;
                            objB3 = stringProvider4.b(StringEnum.USE_TICKET, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                stringProvider = stringProvider4;
                                str = (String) objB3;
                                of1Var = new of1(this, 1);
                                if (superPassBookingSuccessDataState3.d) {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB2 != obj) {
                                        str2 = str;
                                        objB3 = objB2;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider13 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider13;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                } else {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB != obj) {
                                        str2 = str;
                                        objB3 = objB;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider14 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider14;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 4;
                            objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                stringProvider = stringProvider4;
                                str = (String) objB3;
                                of1Var = new of1(this, 1);
                                if (superPassBookingSuccessDataState3.d) {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB2 != obj) {
                                        str2 = str;
                                        objB3 = objB2;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider15 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider15;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                } else {
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB != obj) {
                                        str2 = str;
                                        objB3 = objB;
                                        stringProvider2 = stringProvider;
                                        function0 = of1Var;
                                        str3 = (String) objB3;
                                        str4 = str2;
                                        str5 = str3;
                                        textUIState3 = chaloTextUIState2;
                                        StringProvider stringProvider16 = stringProvider2;
                                        function1 = function0;
                                        textUIState4 = textUIState;
                                        stringProvider3 = stringProvider16;
                                        of1Var2 = new of1(this, 2);
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objH0 != obj) {
                                            textUIState5 = textUIState3;
                                            objB3 = objH0;
                                            textUIState6 = textUIState4;
                                            function2 = function1;
                                            str6 = str5;
                                            str7 = str4;
                                            function3 = of1Var2;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                            if (objB3 != obj) {
                                                textUIState7 = textUIState5;
                                                textUIState8 = textUIState6;
                                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    chaloTextUIState2 = null;
                    textUIState = chaloTextUIState;
                    superPassBookingSuccessDataState3 = superPassBookingSuccessDataState2;
                    if (superPassBookingSuccessDataState3.d) {
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 3;
                        objB3 = stringProvider4.b(StringEnum.USE_TICKET, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                        if (objB3 != obj) {
                            stringProvider = stringProvider4;
                            str = (String) objB3;
                            of1Var = new of1(this, 1);
                            if (superPassBookingSuccessDataState3.d) {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB2 != obj) {
                                    str2 = str;
                                    objB3 = objB2;
                                    stringProvider2 = stringProvider;
                                    function0 = of1Var;
                                    str3 = (String) objB3;
                                    str4 = str2;
                                    str5 = str3;
                                    textUIState3 = chaloTextUIState2;
                                    StringProvider stringProvider17 = stringProvider2;
                                    function1 = function0;
                                    textUIState4 = textUIState;
                                    stringProvider3 = stringProvider17;
                                    of1Var2 = new of1(this, 2);
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                    objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objH0 != obj) {
                                        textUIState5 = textUIState3;
                                        objB3 = objH0;
                                        textUIState6 = textUIState4;
                                        function2 = function1;
                                        str6 = str5;
                                        str7 = str4;
                                        function3 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                        objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB3 != obj) {
                                            textUIState7 = textUIState5;
                                            textUIState8 = textUIState6;
                                            return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                        }
                                    }
                                }
                            } else {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB != obj) {
                                    str2 = str;
                                    objB3 = objB;
                                    stringProvider2 = stringProvider;
                                    function0 = of1Var;
                                    str3 = (String) objB3;
                                    str4 = str2;
                                    str5 = str3;
                                    textUIState3 = chaloTextUIState2;
                                    StringProvider stringProvider18 = stringProvider2;
                                    function1 = function0;
                                    textUIState4 = textUIState;
                                    stringProvider3 = stringProvider18;
                                    of1Var2 = new of1(this, 2);
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                    objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objH0 != obj) {
                                        textUIState5 = textUIState3;
                                        objB3 = objH0;
                                        textUIState6 = textUIState4;
                                        function2 = function1;
                                        str6 = str5;
                                        str7 = str4;
                                        function3 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                        objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB3 != obj) {
                                            textUIState7 = textUIState5;
                                            textUIState8 = textUIState6;
                                            return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 4;
                        objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                        if (objB3 != obj) {
                            stringProvider = stringProvider4;
                            str = (String) objB3;
                            of1Var = new of1(this, 1);
                            if (superPassBookingSuccessDataState3.d) {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                                objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB2 != obj) {
                                    str2 = str;
                                    objB3 = objB2;
                                    stringProvider2 = stringProvider;
                                    function0 = of1Var;
                                    str3 = (String) objB3;
                                    str4 = str2;
                                    str5 = str3;
                                    textUIState3 = chaloTextUIState2;
                                    StringProvider stringProvider19 = stringProvider2;
                                    function1 = function0;
                                    textUIState4 = textUIState;
                                    stringProvider3 = stringProvider19;
                                    of1Var2 = new of1(this, 2);
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                    objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objH0 != obj) {
                                        textUIState5 = textUIState3;
                                        objB3 = objH0;
                                        textUIState6 = textUIState4;
                                        function2 = function1;
                                        str6 = str5;
                                        str7 = str4;
                                        function3 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                        objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB3 != obj) {
                                            textUIState7 = textUIState5;
                                            textUIState8 = textUIState6;
                                            return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                        }
                                    }
                                }
                            } else {
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                                objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                                if (objB != obj) {
                                    str2 = str;
                                    objB3 = objB;
                                    stringProvider2 = stringProvider;
                                    function0 = of1Var;
                                    str3 = (String) objB3;
                                    str4 = str2;
                                    str5 = str3;
                                    textUIState3 = chaloTextUIState2;
                                    StringProvider stringProvider110 = stringProvider2;
                                    function1 = function0;
                                    textUIState4 = textUIState;
                                    stringProvider3 = stringProvider110;
                                    of1Var2 = new of1(this, 2);
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                    objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objH0 != obj) {
                                        textUIState5 = textUIState3;
                                        objB3 = objH0;
                                        textUIState6 = textUIState4;
                                        function2 = function1;
                                        str6 = str5;
                                        str7 = str4;
                                        function3 = of1Var2;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                        superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                        objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                        if (objB3 != obj) {
                                            textUIState7 = textUIState5;
                                            textUIState8 = textUIState6;
                                            return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                textUIState2 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                superPassBookingSuccessDataState4 = (SuperPassBookingSuccessDataState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                superPassBookingSuccessDataState3 = superPassBookingSuccessDataState4;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.ViewScheduleColor.f9869a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new of1(this, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                textUIState = textUIState2;
                if (superPassBookingSuccessDataState3.d) {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 3;
                    objB3 = stringProvider4.b(StringEnum.USE_TICKET, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB3 != obj) {
                        stringProvider = stringProvider4;
                        str = (String) objB3;
                        of1Var = new of1(this, 1);
                        if (superPassBookingSuccessDataState3.d) {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                            objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB2 != obj) {
                                str2 = str;
                                objB3 = objB2;
                                stringProvider2 = stringProvider;
                                function0 = of1Var;
                                str3 = (String) objB3;
                                str4 = str2;
                                str5 = str3;
                                textUIState3 = chaloTextUIState2;
                                StringProvider stringProvider111 = stringProvider2;
                                function1 = function0;
                                textUIState4 = textUIState;
                                stringProvider3 = stringProvider111;
                                of1Var2 = new of1(this, 2);
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                if (objH0 != obj) {
                                    textUIState5 = textUIState3;
                                    objB3 = objH0;
                                    textUIState6 = textUIState4;
                                    function2 = function1;
                                    str6 = str5;
                                    str7 = str4;
                                    function3 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB3 != obj) {
                                        textUIState7 = textUIState5;
                                        textUIState8 = textUIState6;
                                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                    }
                                }
                            }
                        } else {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                            objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB != obj) {
                                str2 = str;
                                objB3 = objB;
                                stringProvider2 = stringProvider;
                                function0 = of1Var;
                                str3 = (String) objB3;
                                str4 = str2;
                                str5 = str3;
                                textUIState3 = chaloTextUIState2;
                                StringProvider stringProvider112 = stringProvider2;
                                function1 = function0;
                                textUIState4 = textUIState;
                                stringProvider3 = stringProvider112;
                                of1Var2 = new of1(this, 2);
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                if (objH0 != obj) {
                                    textUIState5 = textUIState3;
                                    objB3 = objH0;
                                    textUIState6 = textUIState4;
                                    function2 = function1;
                                    str6 = str5;
                                    str7 = str4;
                                    function3 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB3 != obj) {
                                        textUIState7 = textUIState5;
                                        textUIState8 = textUIState6;
                                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = superPassBookingSuccessDataState3;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = stringProvider4;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 4;
                    objB3 = stringProvider4.b(StringEnum.SEE_BOOKING_DETAILS_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB3 != obj) {
                        stringProvider = stringProvider4;
                        str = (String) objB3;
                        of1Var = new of1(this, 1);
                        if (superPassBookingSuccessDataState3.d) {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                            objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB2 != obj) {
                                str2 = str;
                                objB3 = objB2;
                                stringProvider2 = stringProvider;
                                function0 = of1Var;
                                str3 = (String) objB3;
                                str4 = str2;
                                str5 = str3;
                                textUIState3 = chaloTextUIState2;
                                StringProvider stringProvider113 = stringProvider2;
                                function1 = function0;
                                textUIState4 = textUIState;
                                stringProvider3 = stringProvider113;
                                of1Var2 = new of1(this, 2);
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                if (objH0 != obj) {
                                    textUIState5 = textUIState3;
                                    objB3 = objH0;
                                    textUIState6 = textUIState4;
                                    function2 = function1;
                                    str6 = str5;
                                    str7 = str4;
                                    function3 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB3 != obj) {
                                        textUIState7 = textUIState5;
                                        textUIState8 = textUIState6;
                                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                    }
                                }
                            }
                        } else {
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                            objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB != obj) {
                                str2 = str;
                                objB3 = objB;
                                stringProvider2 = stringProvider;
                                function0 = of1Var;
                                str3 = (String) objB3;
                                str4 = str2;
                                str5 = str3;
                                textUIState3 = chaloTextUIState2;
                                StringProvider stringProvider114 = stringProvider2;
                                function1 = function0;
                                textUIState4 = textUIState;
                                stringProvider3 = stringProvider114;
                                of1Var2 = new of1(this, 2);
                                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                                if (objH0 != obj) {
                                    textUIState5 = textUIState3;
                                    objB3 = objH0;
                                    textUIState6 = textUIState4;
                                    function2 = function1;
                                    str6 = str5;
                                    str7 = str4;
                                    function3 = of1Var2;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                                    if (objB3 != obj) {
                                        textUIState7 = textUIState5;
                                        textUIState8 = textUIState6;
                                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                stringProvider = (StringProvider) superPassBookingSuccessComponent$convertToUiState$2.L$3;
                chaloTextUIState2 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$2;
                textUIState = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                superPassBookingSuccessDataState3 = (SuperPassBookingSuccessDataState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                str = (String) objB3;
                of1Var = new of1(this, 1);
                if (superPassBookingSuccessDataState3.d) {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB2 != obj) {
                        str2 = str;
                        objB3 = objB2;
                        stringProvider2 = stringProvider;
                        function0 = of1Var;
                        str3 = (String) objB3;
                        str4 = str2;
                        str5 = str3;
                        textUIState3 = chaloTextUIState2;
                        StringProvider stringProvider115 = stringProvider2;
                        function1 = function0;
                        textUIState4 = textUIState;
                        stringProvider3 = stringProvider115;
                        of1Var2 = new of1(this, 2);
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                        if (objH0 != obj) {
                            textUIState5 = textUIState3;
                            objB3 = objH0;
                            textUIState6 = textUIState4;
                            function2 = function1;
                            str6 = str5;
                            str7 = str4;
                            function3 = of1Var2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                textUIState7 = textUIState5;
                                textUIState8 = textUIState6;
                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                            }
                        }
                    }
                } else {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB != obj) {
                        str2 = str;
                        objB3 = objB;
                        stringProvider2 = stringProvider;
                        function0 = of1Var;
                        str3 = (String) objB3;
                        str4 = str2;
                        str5 = str3;
                        textUIState3 = chaloTextUIState2;
                        StringProvider stringProvider116 = stringProvider2;
                        function1 = function0;
                        textUIState4 = textUIState;
                        stringProvider3 = stringProvider116;
                        of1Var2 = new of1(this, 2);
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                        if (objH0 != obj) {
                            textUIState5 = textUIState3;
                            objB3 = objH0;
                            textUIState6 = textUIState4;
                            function2 = function1;
                            str6 = str5;
                            str7 = str4;
                            function3 = of1Var2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                textUIState7 = textUIState5;
                                textUIState8 = textUIState6;
                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                            }
                        }
                    }
                }
                return obj;
            case 4:
                stringProvider = (StringProvider) superPassBookingSuccessComponent$convertToUiState$2.L$3;
                chaloTextUIState2 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$2;
                textUIState = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                superPassBookingSuccessDataState3 = (SuperPassBookingSuccessDataState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                str = (String) objB3;
                of1Var = new of1(this, 1);
                if (superPassBookingSuccessDataState3.d) {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 5;
                    objB2 = stringProvider4.b(StringEnum.LATER_CAPS, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB2 != obj) {
                        str2 = str;
                        objB3 = objB2;
                        stringProvider2 = stringProvider;
                        function0 = of1Var;
                        str3 = (String) objB3;
                        str4 = str2;
                        str5 = str3;
                        textUIState3 = chaloTextUIState2;
                        StringProvider stringProvider117 = stringProvider2;
                        function1 = function0;
                        textUIState4 = textUIState;
                        stringProvider3 = stringProvider117;
                        of1Var2 = new of1(this, 2);
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                        if (objH0 != obj) {
                            textUIState5 = textUIState3;
                            objB3 = objH0;
                            textUIState6 = textUIState4;
                            function2 = function1;
                            str6 = str5;
                            str7 = str4;
                            function3 = of1Var2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                textUIState7 = textUIState5;
                                textUIState8 = textUIState6;
                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                            }
                        }
                    }
                } else {
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = chaloTextUIState2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = str;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = of1Var;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 6;
                    objB = stringProvider4.b(StringEnum.DONE, new Object[0], superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB != obj) {
                        str2 = str;
                        objB3 = objB;
                        stringProvider2 = stringProvider;
                        function0 = of1Var;
                        str3 = (String) objB3;
                        str4 = str2;
                        str5 = str3;
                        textUIState3 = chaloTextUIState2;
                        StringProvider stringProvider118 = stringProvider2;
                        function1 = function0;
                        textUIState4 = textUIState;
                        stringProvider3 = stringProvider118;
                        of1Var2 = new of1(this, 2);
                        superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                        superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                        superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                        superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                        superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                        superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                        objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                        if (objH0 != obj) {
                            textUIState5 = textUIState3;
                            objB3 = objH0;
                            textUIState6 = textUIState4;
                            function2 = function1;
                            str6 = str5;
                            str7 = str4;
                            function3 = of1Var2;
                            superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                            superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                            superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                            superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                            objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                            if (objB3 != obj) {
                                textUIState7 = textUIState5;
                                textUIState8 = textUIState6;
                                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                            }
                        }
                    }
                }
                return obj;
            case 5:
                function0 = (Function0) superPassBookingSuccessComponent$convertToUiState$2.L$4;
                str2 = (String) superPassBookingSuccessComponent$convertToUiState$2.L$3;
                stringProvider2 = (StringProvider) superPassBookingSuccessComponent$convertToUiState$2.L$2;
                chaloTextUIState2 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                textUIState = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                str3 = (String) objB3;
                str4 = str2;
                str5 = str3;
                textUIState3 = chaloTextUIState2;
                StringProvider stringProvider119 = stringProvider2;
                function1 = function0;
                textUIState4 = textUIState;
                stringProvider3 = stringProvider119;
                of1Var2 = new of1(this, 2);
                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                if (objH0 != obj) {
                    textUIState5 = textUIState3;
                    objB3 = objH0;
                    textUIState6 = textUIState4;
                    function2 = function1;
                    str6 = str5;
                    str7 = str4;
                    function3 = of1Var2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB3 != obj) {
                        textUIState7 = textUIState5;
                        textUIState8 = textUIState6;
                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                    }
                }
                return obj;
            case 6:
                function0 = (Function0) superPassBookingSuccessComponent$convertToUiState$2.L$4;
                str2 = (String) superPassBookingSuccessComponent$convertToUiState$2.L$3;
                stringProvider2 = (StringProvider) superPassBookingSuccessComponent$convertToUiState$2.L$2;
                chaloTextUIState2 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                textUIState = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                str3 = (String) objB3;
                str4 = str2;
                str5 = str3;
                textUIState3 = chaloTextUIState2;
                StringProvider stringProvider1110 = stringProvider2;
                function1 = function0;
                textUIState4 = textUIState;
                stringProvider3 = stringProvider1110;
                of1Var2 = new of1(this, 2);
                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState4;
                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState3;
                superPassBookingSuccessComponent$convertToUiState$2.L$2 = stringProvider3;
                superPassBookingSuccessComponent$convertToUiState$2.L$3 = str4;
                superPassBookingSuccessComponent$convertToUiState$2.L$4 = function1;
                superPassBookingSuccessComponent$convertToUiState$2.L$5 = str5;
                superPassBookingSuccessComponent$convertToUiState$2.L$6 = of1Var2;
                superPassBookingSuccessComponent$convertToUiState$2.label = 7;
                objH0 = H0(superPassBookingSuccessComponent$convertToUiState$2);
                if (objH0 != obj) {
                    textUIState5 = textUIState3;
                    objB3 = objH0;
                    textUIState6 = textUIState4;
                    function2 = function1;
                    str6 = str5;
                    str7 = str4;
                    function3 = of1Var2;
                    superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                    superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                    superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                    superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                    objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                    if (objB3 != obj) {
                        textUIState7 = textUIState5;
                        textUIState8 = textUIState6;
                        return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                    }
                }
                return obj;
            case 7:
                Function0 function4 = (Function0) superPassBookingSuccessComponent$convertToUiState$2.L$6;
                String str8 = (String) superPassBookingSuccessComponent$convertToUiState$2.L$5;
                Function0 function5 = (Function0) superPassBookingSuccessComponent$convertToUiState$2.L$4;
                String str9 = (String) superPassBookingSuccessComponent$convertToUiState$2.L$3;
                stringProvider3 = (StringProvider) superPassBookingSuccessComponent$convertToUiState$2.L$2;
                textUIState5 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                textUIState6 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                function3 = function4;
                function2 = function5;
                str6 = str8;
                str7 = str9;
                superPassBookingSuccessComponent$convertToUiState$2.L$0 = textUIState6;
                superPassBookingSuccessComponent$convertToUiState$2.L$1 = textUIState5;
                superPassBookingSuccessComponent$convertToUiState$2.L$2 = null;
                superPassBookingSuccessComponent$convertToUiState$2.L$3 = null;
                superPassBookingSuccessComponent$convertToUiState$2.L$4 = null;
                superPassBookingSuccessComponent$convertToUiState$2.L$5 = null;
                superPassBookingSuccessComponent$convertToUiState$2.L$6 = null;
                superPassBookingSuccessComponent$convertToUiState$2.label = 8;
                objB3 = SuperPassBookingSuccessDetailsUIStateKt.a(stringProvider3, str7, function2, str6, function3, (List) objB3, superPassBookingSuccessComponent$convertToUiState$2);
                if (objB3 != obj) {
                    textUIState7 = textUIState5;
                    textUIState8 = textUIState6;
                    return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
                }
                return obj;
            case 8:
                textUIState7 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$1;
                textUIState8 = (TextUIState) superPassBookingSuccessComponent$convertToUiState$2.L$0;
                ResultKt.b(objB3);
                return new SuperPassBookingSuccessUIState(textUIState8, textUIState7, (SuperPassBookingSuccessDetailsUIState) objB3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public final void G0() {
        BookingsRequestType magicPassType;
        StateFlow stateFlow = this.f;
        SuperPassSubType superPassSubType = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).c;
        int i = superPassSubType == null ? -1 : WhenMappings.f8434a[superPassSubType.ordinal()];
        if (i == -1) {
            magicPassType = null;
        } else if (i == 1) {
            String str = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).b;
            if (str != null) {
                magicPassType = new BookingsRequestType.MagicPassType(str);
            } else {
                magicPassType = null;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).b;
            if (str2 != null) {
                magicPassType = new BookingsRequestType.RideBasedPassType(str2);
            } else {
                magicPassType = null;
            }
        }
        if (magicPassType != null) {
            ChaloNavigationManagerKt.e(this.n, new TripSummaryArgs.PassSummaryScreen(Source.SUPER_PASS_BOOKING_SUCCESS_SCREEN, magicPassType), null, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        SuperPassBookingSuccessComponent$nextSteps$1 superPassBookingSuccessComponent$nextSteps$1;
        Object obj;
        Pair pair;
        Pair pair2;
        Object objB;
        Object obj2;
        Pair pair3;
        if (continuationImpl instanceof SuperPassBookingSuccessComponent$nextSteps$1) {
            superPassBookingSuccessComponent$nextSteps$1 = (SuperPassBookingSuccessComponent$nextSteps$1) continuationImpl;
            int i = superPassBookingSuccessComponent$nextSteps$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassBookingSuccessComponent$nextSteps$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassBookingSuccessComponent$nextSteps$1 = new SuperPassBookingSuccessComponent$nextSteps$1(this, continuationImpl);
            }
        } else {
            superPassBookingSuccessComponent$nextSteps$1 = new SuperPassBookingSuccessComponent$nextSteps$1(this, continuationImpl);
        }
        Object objB2 = superPassBookingSuccessComponent$nextSteps$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassBookingSuccessComponent$nextSteps$1.label;
        StringProvider stringProvider = this.o;
        if (i2 == 0) {
            ResultKt.b(objB2);
            superPassBookingSuccessComponent$nextSteps$1.label = 1;
            objB2 = stringProvider.b(StringEnum.FIRST_STEP_HEADER, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                obj = superPassBookingSuccessComponent$nextSteps$1.L$0;
                ResultKt.b(objB2);
                pair = new Pair(obj, objB2);
                superPassBookingSuccessComponent$nextSteps$1.L$0 = pair;
                superPassBookingSuccessComponent$nextSteps$1.label = 3;
                objB2 = stringProvider.b(StringEnum.SECOND_STEP_HEADER, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
                if (objB2 != coroutineSingletons) {
                    pair2 = pair;
                    superPassBookingSuccessComponent$nextSteps$1.L$0 = pair2;
                    superPassBookingSuccessComponent$nextSteps$1.L$1 = objB2;
                    superPassBookingSuccessComponent$nextSteps$1.label = 4;
                    objB = stringProvider.b(StringEnum.SECOND_STEP_DESC, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
                    if (objB != coroutineSingletons) {
                        obj2 = objB2;
                        objB2 = objB;
                        pair3 = pair2;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                pair2 = (Pair) superPassBookingSuccessComponent$nextSteps$1.L$0;
                ResultKt.b(objB2);
                superPassBookingSuccessComponent$nextSteps$1.L$0 = pair2;
                superPassBookingSuccessComponent$nextSteps$1.L$1 = objB2;
                superPassBookingSuccessComponent$nextSteps$1.label = 4;
                objB = stringProvider.b(StringEnum.SECOND_STEP_DESC, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
                if (objB != coroutineSingletons) {
                    obj2 = objB2;
                    objB2 = objB;
                    pair3 = pair2;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = superPassBookingSuccessComponent$nextSteps$1.L$1;
            pair3 = (Pair) superPassBookingSuccessComponent$nextSteps$1.L$0;
            ResultKt.b(objB2);
        }
        return CollectionsKt.S(pair3, new Pair(obj2, objB2));
        superPassBookingSuccessComponent$nextSteps$1.L$0 = objB2;
        superPassBookingSuccessComponent$nextSteps$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.FIRST_STEP_DESC, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
        if (objB3 != coroutineSingletons) {
            obj = objB2;
            objB2 = objB3;
            pair = new Pair(obj, objB2);
            superPassBookingSuccessComponent$nextSteps$1.L$0 = pair;
            superPassBookingSuccessComponent$nextSteps$1.label = 3;
            objB2 = stringProvider.b(StringEnum.SECOND_STEP_HEADER, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
            if (objB2 != coroutineSingletons) {
                pair2 = pair;
                superPassBookingSuccessComponent$nextSteps$1.L$0 = pair2;
                superPassBookingSuccessComponent$nextSteps$1.L$1 = objB2;
                superPassBookingSuccessComponent$nextSteps$1.label = 4;
                objB = stringProvider.b(StringEnum.SECOND_STEP_DESC, new Object[0], superPassBookingSuccessComponent$nextSteps$1);
                if (objB != coroutineSingletons) {
                    obj2 = objB2;
                    objB2 = objB;
                    pair3 = pair2;
                    return CollectionsKt.S(pair3, new Pair(obj2, objB2));
                }
            }
        }
        return coroutineSingletons;
    }

    public final void I0(SuperPassBookingSuccessIntent superPassBookingSuccessIntent) {
        SuperPassSubType superPassSubType;
        SceneArgs slotSelectionArgs;
        C0(superPassBookingSuccessIntent);
        if (superPassBookingSuccessIntent instanceof SuperPassBookingSuccessIntent.InitializationIntent) {
            BuildersKt.d(this.j, null, null, new SuperPassBookingSuccessComponent$handleInitializationIntent$1((SuperPassBookingSuccessIntent.InitializationIntent) superPassBookingSuccessIntent, this, null), 3);
            return;
        }
        if (superPassBookingSuccessIntent.equals(SuperPassBookingSuccessIntent.SeeBookingDetailsIntent.f8440a)) {
            K0(this, "booking success view booking details clicked");
            G0();
            return;
        }
        boolean zEquals = superPassBookingSuccessIntent.equals(SuperPassBookingSuccessIntent.PositiveBtnClickedIntent.f8439a);
        ChaloNavigationManager chaloNavigationManager = this.n;
        if (!zEquals) {
            boolean zEquals2 = superPassBookingSuccessIntent.equals(SuperPassBookingSuccessIntent.NegativeBtnClickedIntent.f8438a);
            SuperPassBookingSuccessIntent.BackClickedIntent backClickedIntent = SuperPassBookingSuccessIntent.BackClickedIntent.f8436a;
            if (zEquals2) {
                K0(this, "booking success use later clicked");
                I0(backClickedIntent);
                return;
            } else {
                if (!superPassBookingSuccessIntent.equals(backClickedIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                K0(this, "booking success back btn clicked");
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                return;
            }
        }
        StateFlow stateFlow = this.f;
        J0("booking success use now clicked", MapsKt.k(new Pair("canActivate", Boolean.valueOf(((SuperPassBookingSuccessDataState) stateFlow.getValue()).d))));
        SuperPassBookingSuccessDataState superPassBookingSuccessDataState = (SuperPassBookingSuccessDataState) stateFlow.getValue();
        if (!superPassBookingSuccessDataState.d) {
            G0();
            return;
        }
        if (superPassBookingSuccessDataState.e == null) {
            String str = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).b;
            if (str == null || (superPassSubType = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).c) == null) {
                return;
            }
            HomeArgs homeArgs = new HomeArgs((String) null, (String) null, 7);
            SuperPassSubType.INSTANCE.getClass();
            ChaloNavigationManagerKt.b(chaloNavigationManager, homeArgs, new ProductActivationArgs(str, "superPass", SuperPassSubType.Companion.b(superPassSubType), null, null, null, null, 1016));
            return;
        }
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).e;
        String str2 = ((SuperPassBookingSuccessDataState) stateFlow.getValue()).b;
        if (str2 == null) {
            return;
        }
        PBOriginDestinationAppModel pBOriginDestinationAppModel = superPassPurchaseStopsInfo != null ? new PBOriginDestinationAppModel(EmptyList.f17557a, null, superPassPurchaseStopsInfo.b, superPassPurchaseStopsInfo.f5665a, null, null, null, superPassPurchaseStopsInfo.d, superPassPurchaseStopsInfo.c, null, null, null, 31842) : null;
        if (pBOriginDestinationAppModel == null) {
            slotSelectionArgs = new PremiumBusArgs.StopSelectionArgs(str2, false, false, Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT, (String) null, 22);
        } else {
            Pair pairA = pBOriginDestinationAppModel.a();
            PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass ticketPurchaseThroughPass = new PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass(str2, (PBStopPlaceSelectedAppModel) pairA.d(), (PBStopPlaceSelectedAppModel) pairA.e(), this.p.j());
            Source source = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
            Json json = ChaloJson.b;
            json.getClass();
            slotSelectionArgs = new PremiumBusArgs.SlotSelectionArgs(source, json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), ticketPurchaseThroughPass), null);
        }
        ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), slotSelectionArgs);
    }

    public final void J0(String str, LinkedHashMap linkedHashMap) {
        linkedHashMap.put("source", "booking success screen");
        linkedHashMap.put("isSuperPass", Boolean.TRUE);
        linkedHashMap.put("productType", "superPass");
        linkedHashMap.put("productSubType", String.valueOf(((SuperPassBookingSuccessDataState) this.f.getValue()).c));
        AnalyticsContract.DefaultImpls.a(this.l, str, "booking success screen", linkedHashMap, null, false, 24);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SuperPassBookingSuccessDataState(null, null, null, true, null);
    }
}

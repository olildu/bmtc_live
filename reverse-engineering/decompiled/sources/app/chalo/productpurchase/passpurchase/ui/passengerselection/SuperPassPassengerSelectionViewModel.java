package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import androidx.autofill.HintConstants;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.da1;
import defpackage.zf1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionViewModel;", "Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassPassengerSelectionViewModel extends SuperPassScreenBaseComponent<SuperPassPassengerSelectionIntent, SuperPassPassengerSelectionDataState, SuperPassPassengerSelectionUIState, SuperPassPassengerSelectionEffect> {
    public final SuperPassPassengerSelectionManager k;
    public final SuperPassRepository l;
    public final AnalyticsContract m;
    public final ChaloNavigationManager n;
    public final SmartSuperPassPassengerSelectionHelper o;
    public final StringProvider p;
    public final Lazy q;
    public SuperPassPassengerSelectionDataState r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionViewModel$Companion;", "", "", "SUPER_PASS_PASSENGER_SELECTION_STATE_KEEPER_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SuperPassPassengerSelectionViewModel(SuperPassPurchaseArgs.PassengerSelectionArgs passengerSelectionArgs, ComponentContext componentContext, SuperPassPassengerSelectionManager superPassPassengerSelectionManager, SuperPassRepository superPassRepository, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, SmartSuperPassPassengerSelectionHelper smartSuperPassPassengerSelectionHelper, StringProvider stringProvider) {
        super(componentContext, superPassPassengerSelectionManager);
        this.k = superPassPassengerSelectionManager;
        this.l = superPassRepository;
        this.m = analyticsContract;
        this.n = chaloNavigationManager;
        this.o = smartSuperPassPassengerSelectionHelper;
        this.p = stringProvider;
        this.q = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.passengerselection.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new SuperPassPassengerSelectionViewModel$toolbar$2$1(0, this.f8453a.k, SuperPassPassengerSelectionManager.class, "reportProblem", "reportProblem()V", 0)), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, null, 12)), 0.0f, null, null, 239);
            }
        });
        componentContext.getB().d("superPassPassengerSelectionStateKeeperKey", SuperPassPassengerSelectionDataState.INSTANCE.serializer(), new zf1(this, 1));
        n(new zf1(this, 2));
    }

    public static final void q(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel, SuperPassUserDetails superPassUserDetails, boolean z) {
        AnalyticsContract analyticsContract = superPassPassengerSelectionViewModel.m;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isConvertedToRenewFlow", Boolean.valueOf(z)));
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        linkedHashMapK.put("fullName", superPassUserDetails.c);
        linkedHashMapK.put("dateOfBirth", superPassUserDetails.e);
        linkedHashMapK.put(HintConstants.AUTOFILL_HINT_GENDER, superPassUserDetails.d.name());
        linkedHashMapK.put("mobileNumber", superPassUserDetails.b);
        linkedHashMapK.put("userId", superPassUserDetails.f9580a);
        linkedHashMapK.put("dobInMillis", Long.valueOf(superPassUserDetails.a(MixpanelUtil.d())));
        linkedHashMapK.put("emailId", superPassUserDetails.f);
        AnalyticsContract.DefaultImpls.a(analyticsContract, "smartPassengerSelection screen passenger selected", "", linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final /* bridge */ /* synthetic */ Object a(SuperPassPurchaseSharedState superPassPurchaseSharedState, Object obj, SuspendLambda suspendLambda) {
        return r((SuperPassPassengerSelectionDataState) obj, suspendLambda);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final Object m() {
        if (this.r == null) {
            this.r = (SuperPassPassengerSelectionDataState) this.f8402a.getB().a("superPassPassengerSelectionStateKeeperKey", SuperPassPassengerSelectionDataState.INSTANCE.serializer());
        }
        SuperPassPassengerSelectionDataState superPassPassengerSelectionDataState = this.r;
        return superPassPassengerSelectionDataState == null ? new SuperPassPassengerSelectionDataState(EmptyList.f17557a) : superPassPassengerSelectionDataState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(SuperPassPassengerSelectionDataState superPassPassengerSelectionDataState, ContinuationImpl continuationImpl) {
        SuperPassPassengerSelectionViewModel$convertToUiState$1 superPassPassengerSelectionViewModel$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        SuperPassPassengerSelectionDataState superPassPassengerSelectionDataState2;
        List list;
        TextUIState textUIState;
        List list2;
        if (continuationImpl instanceof SuperPassPassengerSelectionViewModel$convertToUiState$1) {
            superPassPassengerSelectionViewModel$convertToUiState$1 = (SuperPassPassengerSelectionViewModel$convertToUiState$1) continuationImpl;
            int i = superPassPassengerSelectionViewModel$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPassengerSelectionViewModel$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPassengerSelectionViewModel$convertToUiState$1 = new SuperPassPassengerSelectionViewModel$convertToUiState$1(this, continuationImpl);
            }
        } else {
            superPassPassengerSelectionViewModel$convertToUiState$1 = new SuperPassPassengerSelectionViewModel$convertToUiState$1(this, continuationImpl);
        }
        Object obj = superPassPassengerSelectionViewModel$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPassengerSelectionViewModel$convertToUiState$1.label;
        StringProvider stringProvider = this.p;
        if (i2 == 0) {
            ResultKt.b(obj);
            ToolbarUIState toolbarUIState2 = (ToolbarUIState) this.q.getValue();
            superPassPassengerSelectionViewModel$convertToUiState$1.L$0 = superPassPassengerSelectionDataState;
            superPassPassengerSelectionViewModel$convertToUiState$1.L$1 = toolbarUIState2;
            superPassPassengerSelectionViewModel$convertToUiState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.SELECT_PASSENGER, new Object[0], superPassPassengerSelectionViewModel$convertToUiState$1);
            if (objB != coroutineSingletons) {
                toolbarUIState = toolbarUIState2;
                obj = objB;
                superPassPassengerSelectionDataState2 = superPassPassengerSelectionDataState;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            toolbarUIState = (ToolbarUIState) superPassPassengerSelectionViewModel$convertToUiState$1.L$1;
            superPassPassengerSelectionDataState2 = (SuperPassPassengerSelectionDataState) superPassPassengerSelectionViewModel$convertToUiState$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textUIState = (TextUIState) superPassPassengerSelectionViewModel$convertToUiState$1.L$3;
            toolbarUIState = (ToolbarUIState) superPassPassengerSelectionViewModel$convertToUiState$1.L$2;
            list = (List) superPassPassengerSelectionViewModel$convertToUiState$1.L$1;
            list2 = (List) superPassPassengerSelectionViewModel$convertToUiState$1.L$0;
            ResultKt.b(obj);
        }
        list.add(new PassPassengerSelectionCardUIState(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), UiEventHandler.Companion.a(new zf1(this, 0))));
        return new SuperPassPassengerSelectionUIState(toolbarUIState, textUIState, list2);
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_87, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        ArrayList arrayList = new ArrayList();
        for (SuperPassUserDetails superPassUserDetails : superPassPassengerSelectionDataState2.f8444a) {
            arrayList.add(new PassPassengerSelectionCardUIState(new TextUIState.ChaloTextUIState(superPassUserDetails.c, UITextStyle.HeadlineMedium, black_87, 0, UITextAlign.Left, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), UiEventHandler.Companion.a(new da1(14, this, superPassUserDetails))));
        }
        superPassPassengerSelectionViewModel$convertToUiState$1.L$0 = arrayList;
        superPassPassengerSelectionViewModel$convertToUiState$1.L$1 = arrayList;
        superPassPassengerSelectionViewModel$convertToUiState$1.L$2 = toolbarUIState;
        superPassPassengerSelectionViewModel$convertToUiState$1.L$3 = chaloTextUIState;
        superPassPassengerSelectionViewModel$convertToUiState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.NEW_PASSENGER, new Object[0], superPassPassengerSelectionViewModel$convertToUiState$1);
        if (objB2 != coroutineSingletons) {
            list = arrayList;
            textUIState = chaloTextUIState;
            obj = objB2;
            list2 = list;
            list.add(new PassPassengerSelectionCardUIState(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), UiEventHandler.Companion.a(new zf1(this, 0))));
            return new SuperPassPassengerSelectionUIState(toolbarUIState, textUIState, list2);
        }
        return coroutineSingletons;
    }

    public final void s(SuperPassPassengerSelectionIntent superPassPassengerSelectionIntent) {
        o(superPassPassengerSelectionIntent);
        boolean zEquals = superPassPassengerSelectionIntent.equals(SuperPassPassengerSelectionIntent.InitializationIntent.f8447a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new SuperPassPassengerSelectionViewModel$handleInitializationIntent$1(this, null), 3);
            return;
        }
        if (!superPassPassengerSelectionIntent.equals(SuperPassPassengerSelectionIntent.AddNewPassengerIntent.f8446a)) {
            if (!(superPassPassengerSelectionIntent instanceof SuperPassPassengerSelectionIntent.PassengerSelectedIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1(this, (SuperPassPassengerSelectionIntent.PassengerSelectedIntent) superPassPassengerSelectionIntent, null), 3);
        } else {
            AnalyticsContract.DefaultImpls.a(this.m, "smartPassengerSelection screen new passenger selected", "", MapsKt.d(), null, false, 24);
            this.k.W();
            this.n.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs(SuperPassBasicUserPurpose.COMPLETE_DETAILS), null, null, 6));
        }
    }
}

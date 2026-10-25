package app.chalo.premiumbus.ui.stopdetails;

import app.chalo.citydata.domain.FetchStopDetailsUseCase;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.dj0;
import defpackage.do0;
import defpackage.uo0;
import defpackage.za0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsViewState;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsDataState;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PBStopDetailsComponent extends ChaloBaseStateMviComponent<PremiumBusStopDetailsIntent, PremiumBusStopDetailsViewState, PremiumBusStopDetailsViewState, PremiumBusStopDetailsSideEffect> {
    public final PremiumBusArgs.PremiumStopDetailsArgs k;
    public final ComponentContext l;
    public final FetchStopDetailsUseCase m;
    public final StringProvider n;
    public final ChaloMapMarkerInfoWindowProvider o;
    public final ChaloNavigationManager p;
    public final SystemHelper q;
    public PBStopDetailsNavAppModel r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7934a;

        static {
            int[] iArr = new int[PBStopDetailsMainScreenStopSectionType.values().length];
            try {
                iArr[PBStopDetailsMainScreenStopSectionType.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PBStopDetailsMainScreenStopSectionType.DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7934a = iArr;
        }
    }

    public PBStopDetailsComponent(PremiumBusArgs.PremiumStopDetailsArgs premiumStopDetailsArgs, ComponentContext componentContext, FetchStopDetailsUseCase fetchStopDetailsUseCase, StringProvider stringProvider, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, ChaloNavigationManager chaloNavigationManager, SystemHelper systemHelper) {
        super(componentContext);
        this.k = premiumStopDetailsArgs;
        this.l = componentContext;
        this.m = fetchStopDetailsUseCase;
        this.n = stringProvider;
        this.o = chaloMapMarkerInfoWindowProvider;
        this.p = chaloNavigationManager;
        this.q = systemHelper;
        G0(new PremiumBusStopDetailsIntent.InitializationIntent(new PBStopDetailsNavAppModel(premiumStopDetailsArgs.d, premiumStopDetailsArgs.e, premiumStopDetailsArgs.c)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PBStopDetailsComponent pBStopDetailsComponent, ContinuationImpl continuationImpl) {
        PBStopDetailsComponent$fetchStopDetails$1 pBStopDetailsComponent$fetchStopDetails$1;
        PBStopDetailsNavAppModel pBStopDetailsNavAppModel;
        pBStopDetailsComponent.getClass();
        if (continuationImpl instanceof PBStopDetailsComponent$fetchStopDetails$1) {
            pBStopDetailsComponent$fetchStopDetails$1 = (PBStopDetailsComponent$fetchStopDetails$1) continuationImpl;
            int i = pBStopDetailsComponent$fetchStopDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pBStopDetailsComponent$fetchStopDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                pBStopDetailsComponent$fetchStopDetails$1 = new PBStopDetailsComponent$fetchStopDetails$1(pBStopDetailsComponent, continuationImpl);
            }
        } else {
            pBStopDetailsComponent$fetchStopDetails$1 = new PBStopDetailsComponent$fetchStopDetails$1(pBStopDetailsComponent, continuationImpl);
        }
        Object obj = pBStopDetailsComponent$fetchStopDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pBStopDetailsComponent$fetchStopDetails$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            PBStopDetailsNavAppModel pBStopDetailsNavAppModel2 = pBStopDetailsComponent.r;
            if (pBStopDetailsNavAppModel2 == null) {
                return unit;
            }
            pBStopDetailsComponent.E0(new do0(4));
            FetchStopDetailsUseCase fetchStopDetailsUseCase = pBStopDetailsComponent.m;
            String str = (String) CollectionsKt.F(pBStopDetailsNavAppModel2.f7938a);
            List listS = CollectionsKt.S(pBStopDetailsNavAppModel2.b, pBStopDetailsNavAppModel2.c);
            pBStopDetailsComponent$fetchStopDetails$1.L$0 = pBStopDetailsNavAppModel2;
            pBStopDetailsComponent$fetchStopDetails$1.label = 1;
            Object objA = fetchStopDetailsUseCase.a(str, listS, pBStopDetailsComponent$fetchStopDetails$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            pBStopDetailsNavAppModel = pBStopDetailsNavAppModel2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pBStopDetailsNavAppModel = (PBStopDetailsNavAppModel) pBStopDetailsComponent$fetchStopDetails$1.L$0;
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            pBStopDetailsComponent.E0(new do0(5));
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = pBStopDetailsNavAppModel.b;
        String str3 = pBStopDetailsNavAppModel.c;
        BuildersKt.d(pBStopDetailsComponent.j, null, null, new PBStopDetailsComponent$processStopDetails$1((List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, pBStopDetailsComponent, str2, str3, null), 3);
        return unit;
    }

    public final void G0(PremiumBusStopDetailsIntent intent) {
        PremiumBusStopDetails premiumBusStopDetails;
        PremiumBusStopDetails premiumBusStopDetails2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PremiumBusStopDetailsIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        LatLng latLng = null;
        if (z) {
            BuildersKt.d(contextScope, null, null, new PBStopDetailsComponent$processIntent$1(this, intent, null), 3);
            return;
        }
        if (intent instanceof PremiumBusStopDetailsIntent.OnDirectionClicked) {
            PremiumBusStopDetailsIntent.OnDirectionClicked onDirectionClicked = (PremiumBusStopDetailsIntent.OnDirectionClicked) intent;
            this.q.h(onDirectionClicked.b, onDirectionClicked.f7945a);
            return;
        }
        if (intent.equals(PremiumBusStopDetailsIntent.OnRetryClicked.f7948a)) {
            BuildersKt.d(contextScope, null, null, new PBStopDetailsComponent$processIntent$2(this, null), 3);
            return;
        }
        if ((intent instanceof PremiumBusStopDetailsIntent.MapInteractionIntent.OnMapMarkerClicked) || (intent instanceof PremiumBusStopDetailsIntent.MapInteractionIntent.OnMapReady)) {
            return;
        }
        boolean z2 = intent instanceof PremiumBusStopDetailsIntent.OnStopTabSelected;
        StateFlow stateFlow = this.f;
        if (z2) {
            String str = ((PremiumBusStopDetailsIntent.OnStopTabSelected) intent).f7949a;
            PremiumBusStopDetails premiumBusStopDetails3 = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).c;
            if (str.equals(premiumBusStopDetails3 != null ? premiumBusStopDetails3.f7942a : null)) {
                PremiumBusStopDetails premiumBusStopDetails4 = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).c;
                if (premiumBusStopDetails4 != null) {
                    latLng = premiumBusStopDetails4.d;
                }
            } else {
                PremiumBusStopDetails premiumBusStopDetails5 = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).d;
                if (str.equals(premiumBusStopDetails5 != null ? premiumBusStopDetails5.f7942a : null) && (premiumBusStopDetails2 = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).d) != null) {
                    latLng = premiumBusStopDetails2.d;
                }
            }
            if (latLng != null) {
                E0(new za0(19, latLng, str, this));
                return;
            }
            return;
        }
        boolean zEquals = intent.equals(PremiumBusStopDetailsIntent.OnBackPressed.f7944a);
        PremiumBusStopDetailsIntent.OnImageDialogDismissed onImageDialogDismissed = PremiumBusStopDetailsIntent.OnImageDialogDismissed.f7947a;
        if (zEquals) {
            if (this.k.f) {
                q0(new uo0(this, 0));
                return;
            }
            PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).f;
            if (Intrinsics.d(pBStopDetailsZoomedImageState, PBStopDetailsZoomedImageState.Hide.f7940a)) {
                q0(new uo0(this, 1));
                return;
            } else {
                if (!(pBStopDetailsZoomedImageState instanceof PBStopDetailsZoomedImageState.Show)) {
                    throw new NoWhenBranchMatchedException();
                }
                G0(onImageDialogDismissed);
                return;
            }
        }
        if (!(intent instanceof PremiumBusStopDetailsIntent.OnImageClicked)) {
            if (!intent.equals(onImageDialogDismissed)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new do0(3));
            return;
        }
        PremiumBusStopDetailsIntent.OnImageClicked onImageClicked = (PremiumBusStopDetailsIntent.OnImageClicked) intent;
        PBStopDetailsMainScreenStopSectionType pBStopDetailsMainScreenStopSectionType = onImageClicked.b;
        int i = onImageClicked.f7946a;
        int i2 = WhenMappings.f7934a[pBStopDetailsMainScreenStopSectionType.ordinal()];
        if (i2 == 1) {
            premiumBusStopDetails = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).c;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            premiumBusStopDetails = ((PremiumBusStopDetailsViewState) stateFlow.getValue()).d;
        }
        if (premiumBusStopDetails != null) {
            PBBusStopImageType pBBusStopImageType = premiumBusStopDetails.e;
            if (pBBusStopImageType instanceof PBBusStopImageType.Available) {
                List list = ((PBBusStopImageType.Available) pBBusStopImageType).f7931a;
                if (i < 0 || i > CollectionsKt.K(list)) {
                    i = 0;
                }
                E0(new dj0(list, i, 1));
            }
        }
    }

    public final ChaloMapMarkerInfoWindow H0(String str, String str2) {
        return this.o.a(new PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), str2 != null ? new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusStopDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusStopDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new PremiumBusStopDetailsViewState();
    }
}

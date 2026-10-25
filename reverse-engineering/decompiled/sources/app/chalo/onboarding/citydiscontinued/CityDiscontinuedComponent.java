package app.chalo.onboarding.citydiscontinued;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.extensions.StringExtsKt;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.k2;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedDataState;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedUIState;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedSideEffect;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDiscontinuedComponent extends ChaloBaseStateMviComponent<CityDiscontinuedIntent, CityDiscontinuedDataState, CityDiscontinuedUIState, CityDiscontinuedSideEffect> {
    public final CityDiscontinuedUIStateFactory k;
    public final ChaloNavigationManager l;
    public final AnalyticsContract m;

    public CityDiscontinuedComponent(ComponentContext componentContext, CityDiscontinuedArgs cityDiscontinuedArgs, CityDiscontinuedUIStateFactory cityDiscontinuedUIStateFactory, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = cityDiscontinuedUIStateFactory;
        this.l = chaloNavigationManager;
        this.m = analyticsContract;
        G0(new CityDiscontinuedIntent.InitializationIntent(StringExtsKt.a(cityDiscontinuedArgs.b)));
    }

    public final void F0() {
        this.l.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.CITY_DISCONTINUED_SCREEN, null, 4), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.CityDiscontinuedScreen, true), 3), null, 4));
    }

    public final void G0(CityDiscontinuedIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof CityDiscontinuedIntent.InitializationIntent) {
            String str = ((CityDiscontinuedIntent.InitializationIntent) intent).f6554a;
            AnalyticsContractImplKt.b(this.m, "city discontinued screen displayed", Source.CITY_DISCONTINUED_SCREEN, vo1.s("cityName", str), false, 24);
            E0(new k2(str, 21));
            return;
        }
        if (intent.equals(CityDiscontinuedIntent.OnSupportedCitiesButtonClicked.f6556a)) {
            AnalyticsContractImplKt.b(this.m, "city discontinued change city clicked", Source.CITY_DISCONTINUED_SCREEN, null, false, 28);
            F0();
        } else {
            if (!intent.equals(CityDiscontinuedIntent.OnBackPressed.f6555a)) {
                throw new NoWhenBranchMatchedException();
            }
            F0();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        CityDiscontinuedComponent$convertToUiState$2 cityDiscontinuedComponent$convertToUiState$2 = new CityDiscontinuedComponent$convertToUiState$2(1, this, CityDiscontinuedComponent.class, "processIntent", "processIntent(Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;)V", 0);
        return this.k.a((CityDiscontinuedDataState) obj, cityDiscontinuedComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CityDiscontinuedDataState(null);
    }
}

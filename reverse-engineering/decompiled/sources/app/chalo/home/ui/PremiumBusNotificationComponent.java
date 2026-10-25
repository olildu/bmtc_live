package app.chalo.home.ui;

import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.cityprovider.CityProvider;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/PremiumBusNotificationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/PremiumBusNotificationViewIntent;", "Lapp/chalo/home/ui/PremiumBusNotificationViewState;", "Lapp/chalo/home/ui/PremiumBusNotificationDataState;", "Lapp/chalo/home/ui/PremiumBusNotificationSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusNotificationComponent extends ChaloBaseStateMviComponent<PremiumBusNotificationViewIntent, PremiumBusNotificationViewState, PremiumBusNotificationViewState, PremiumBusNotificationSideEffect> {
    public final CityProvider k;
    public final ComponentContext l;

    public PremiumBusNotificationComponent(CityProvider cityProvider, ComponentContext componentContext) {
        super(componentContext);
        this.k = cityProvider;
        this.l = componentContext;
        PremiumBusNotificationViewIntent.InitializationIntent initializationIntent = PremiumBusNotificationViewIntent.InitializationIntent.f3176a;
        C0(initializationIntent);
        if (!initializationIntent.equals(initializationIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.d(this.j, null, null, new PremiumBusNotificationComponent$handleInitializationIntent$1(this, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusNotificationViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusNotificationViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new PremiumBusNotificationViewState();
    }
}

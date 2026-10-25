package app.chalo.home.ui.chalobus;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ud;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewState;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialDataState;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTutorialComponent extends ChaloBaseStateMviComponent<PremiumBusTutorialViewIntent, PremiumBusTutorialViewState, PremiumBusTutorialViewState, PremiumBusTutorialSideEffect> {
    public final ChaloNavigationManager k;
    public final UrlOpenHelper l;
    public final KotlinToastManager m;
    public final StringProvider n;
    public final AnalyticsContract o;

    public PremiumBusTutorialComponent(ComponentContext componentContext, PremiumBusTutorialScreenArgs premiumBusTutorialScreenArgs, ChaloNavigationManager chaloNavigationManager, UrlOpenHelper urlOpenHelper, KotlinToastManager kotlinToastManager, StringProvider stringProvider, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = chaloNavigationManager;
        this.l = urlOpenHelper;
        this.m = kotlinToastManager;
        this.n = stringProvider;
        this.o = analyticsContract;
        Json json = ChaloJson.b;
        String str = premiumBusTutorialScreenArgs.b;
        json.getClass();
        E0(new ud((List) json.b(str, new ArrayListSerializer(PremiumBusTutorialConfigUiModel.INSTANCE.serializer())), 22));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusTutorialViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusTutorialViewState(EmptyList.f17557a);
    }
}

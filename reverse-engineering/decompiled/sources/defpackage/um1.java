package defpackage;

import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.TripPlannerArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class um1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19761a;
    public final /* synthetic */ UniversalPickerComponent b;
    public final /* synthetic */ UniversalSearchDescriptiveLocationAppModel c;

    public /* synthetic */ um1(UniversalPickerComponent universalPickerComponent, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, int i) {
        this.f19761a = i;
        this.b = universalPickerComponent;
        this.c = universalSearchDescriptiveLocationAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19761a) {
            case 0:
                ChaloNavigationManager chaloNavigationManager = this.b.z;
                Json json = ChaloJson.b;
                json.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), this.c)), null, null, 6));
                break;
            case 1:
                ChaloNavigationManager chaloNavigationManager2 = this.b.z;
                Json json2 = ChaloJson.b;
                json2.getClass();
                chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json2.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), this.c)), null, null, 6));
                break;
            case 2:
                ChaloNavigationManager chaloNavigationManager3 = this.b.z;
                Json json3 = ChaloJson.b;
                json3.getClass();
                chaloNavigationManager3.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json3.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), this.c)), null, null, 6));
                break;
            default:
                ChaloNavigationManager chaloNavigationManager4 = this.b.z;
                Json json4 = ChaloJson.b;
                json4.getClass();
                chaloNavigationManager4.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json4.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), this.c)), null, null, 6));
                break;
        }
        return Unit.f17538a;
    }
}

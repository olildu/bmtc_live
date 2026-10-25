package defpackage;

import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsIntent;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LanguageSelectionArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19273a;
    public final /* synthetic */ AppMigrationPreconditionsComponent b;

    public /* synthetic */ s6(AppMigrationPreconditionsComponent appMigrationPreconditionsComponent, int i) {
        this.f19273a = i;
        this.b = appMigrationPreconditionsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19273a) {
            case 0:
                this.b.J0(AppMigrationPreconditionsIntent.RetryClickedIntent.f957a);
                break;
            case 1:
                this.b.m.b(new ChaloNavigationRequest.Navigate(AppMigrationPreconditionsArgs.INSTANCE, new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                break;
            case 2:
                this.b.m.b(new ChaloNavigationRequest.Navigate(new LanguageSelectionArgs(LanguageSelectionSourceType.SPLASH_SCREEN), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                break;
            case 3:
                this.b.m.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                break;
            default:
                this.b.J0(AppMigrationPreconditionsIntent.BackClickedIntent.f955a);
                break;
        }
        return Unit.f17538a;
    }
}

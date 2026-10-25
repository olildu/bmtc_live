package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.VerticalDashedLineKt;
import app.chalo.compose.components.ValidationUserDetailsComponentKt;
import app.chalo.compose.components.YesBankBrandingKt;
import app.chalo.compose.webview.WebViewComponent_androidKt;
import app.chalo.compose.webview.WebViewState;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerKt;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.login.ui.userconsent.UserConsentScreenKt;
import app.chalo.login.ui.userconsent.UserConsentUIState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.productactivation.ui.UpsellRideSectionComposablesKt;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState;
import app.chalo.productsummary.ui.compose.components.UserProfileComponentKt;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.YesBankBrandingUIState;
import app.chalo.uistate.components.ValidationProductInfoUIState;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.base.WalletBaseComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessScreenKt;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessViewState;
import app.chalo.wallet.ui.mainbalance.WalletBalanceViewState;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15844a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hn1(int i, int i2, Modifier modifier, Object obj) {
        this.f15844a = i2;
        this.d = modifier;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15844a) {
            case 0:
                ((Integer) obj2).getClass();
                UpsellRideSectionComposablesKt.a((UpsellRideSectionUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                UserConsentScreenKt.c((UserConsentUIState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                UserProfileComponentKt.a((Modifier) this.d, (UserInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                UserProfilingChaloBusStickyBannerKt.a((Modifier) this.d, (UserProfilingChaloBusStickyBannerUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                UserProfilingHomeStickyBannerKt.a((Modifier) this.d, (UserProfilingHomeStickyBannerUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ValidationUserDetailsComponentKt.a((ValidationProductInfoUIState.ValidationUserDetailsUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                VerticalDashedLineKt.a((Modifier) this.d, (VerticalDashedLineUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                WalletAccessBaseScreenKt.c((WalletBaseComponent) this.c, (Function2) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                WalletBalanceComposableKt.f((WalletBalanceViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                WalletBalanceComposableKt.d((ContactSupportUIState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                WalletLoadBalanceSuccessScreenKt.a((WalletLoadBalanceSuccessViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                WebViewComponent_androidKt.a((WebViewState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                YesBankBrandingKt.a((YesBankBrandingUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ hn1(Object obj, Object obj2, int i, int i2) {
        this.f15844a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

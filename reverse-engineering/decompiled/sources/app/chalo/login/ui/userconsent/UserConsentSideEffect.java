package app.chalo.login.ui.userconsent;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentSideEffect;", "", "UpdateWebPageForSkipButton", "UpdateWebPageToStopLoading", "Lapp/chalo/login/ui/userconsent/UserConsentSideEffect$UpdateWebPageForSkipButton;", "Lapp/chalo/login/ui/userconsent/UserConsentSideEffect$UpdateWebPageToStopLoading;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserConsentSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentSideEffect$UpdateWebPageForSkipButton;", "Lapp/chalo/login/ui/userconsent/UserConsentSideEffect;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateWebPageForSkipButton extends UserConsentSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5363a;

        public UpdateWebPageForSkipButton(boolean z) {
            this.f5363a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateWebPageForSkipButton) && this.f5363a == ((UpdateWebPageForSkipButton) obj).f5363a;
        }

        public final int hashCode() {
            return this.f5363a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("UpdateWebPageForSkipButton(shouldShowSkip=", ")", this.f5363a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentSideEffect$UpdateWebPageToStopLoading;", "Lapp/chalo/login/ui/userconsent/UserConsentSideEffect;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateWebPageToStopLoading extends UserConsentSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateWebPageToStopLoading f5364a = new UpdateWebPageToStopLoading();
    }
}

package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsEffect;", "", "FocusRequester", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsEffect$FocusRequester;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassEnterUserDetailsEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsEffect$FocusRequester;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FocusRequester extends SuperPassEnterUserDetailsEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8413a;

        public FocusRequester(boolean z) {
            this.f8413a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FocusRequester) && this.f8413a == ((FocusRequester) obj).f8413a;
        }

        public final int hashCode() {
            return this.f8413a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("FocusRequester(shouldRequest=", ")", this.f8413a);
        }
    }
}

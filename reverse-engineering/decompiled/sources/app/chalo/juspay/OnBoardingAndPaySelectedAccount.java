package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/OnBoardingAndPaySelectedAccount;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OnBoardingAndPaySelectedAccount {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4084a;
    public final UserUpiAccountDetails b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/OnBoardingAndPaySelectedAccount$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/OnBoardingAndPaySelectedAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OnBoardingAndPaySelectedAccount> serializer() {
            return OnBoardingAndPaySelectedAccount$$serializer.f4085a;
        }
    }

    public /* synthetic */ OnBoardingAndPaySelectedAccount(int i, String str, UserUpiAccountDetails userUpiAccountDetails) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(OnBoardingAndPaySelectedAccount$$serializer.f4085a.getDescriptor(), i, 3);
            throw null;
        }
        this.f4084a = str;
        this.b = userUpiAccountDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBoardingAndPaySelectedAccount)) {
            return false;
        }
        OnBoardingAndPaySelectedAccount onBoardingAndPaySelectedAccount = (OnBoardingAndPaySelectedAccount) obj;
        return Intrinsics.d(this.f4084a, onBoardingAndPaySelectedAccount.f4084a) && Intrinsics.d(this.b, onBoardingAndPaySelectedAccount.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4084a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBoardingAndPaySelectedAccount(upiId=" + this.f4084a + ", accountDetails=" + this.b + ")";
    }

    public OnBoardingAndPaySelectedAccount(String str, UserUpiAccountDetails userUpiAccountDetails) {
        this.f4084a = str;
        this.b = userUpiAccountDetails;
    }
}

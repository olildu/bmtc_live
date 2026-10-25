package app.chalo.usercommutepreference.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase;", "", "CheckEligibilityErrorType", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckSaveRideEligibilityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f10274a;
    public final UserCommutePreferenceRepository b;
    public final UserProfileDetailsProvider c;
    public final CityProvider d;
    public final TimeUtilsContract e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType;", "", "UserNotLoggedIn", "InvalidCity", "LocalError", "UnknownError", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CheckEligibilityErrorType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends CheckEligibilityErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidCity f10275a = new InvalidCity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 1572871744;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends CheckEligibilityErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10276a;

            public LocalError(String str) {
                this.f10276a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalError) && Intrinsics.d(this.f10276a, ((LocalError) obj).f10276a);
            }

            public final int hashCode() {
                String str = this.f10276a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.f10276a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends CheckEligibilityErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10277a;

            public UnknownError(String str) {
                this.f10277a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.f10277a, ((UnknownError) obj).f10277a);
            }

            public final int hashCode() {
                String str = this.f10277a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.f10277a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$CheckEligibilityErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends CheckEligibilityErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UserNotLoggedIn f10278a = new UserNotLoggedIn();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return -868035411;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/usercommutepreference/domain/CheckSaveRideEligibilityUseCase$Companion;", "", "", "THIRTY_MINUTES_MILLIS", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckSaveRideEligibilityUseCase(PremiumBusRepository premiumBusRepository, UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, TimeUtilsContract timeUtilsContract) {
        this.f10274a = premiumBusRepository;
        this.b = userCommutePreferenceRepository;
        this.c = userProfileDetailsProvider;
        this.d = cityProvider;
        this.e = timeUtilsContract;
    }

    public static List a(List list) {
        int size;
        List listSubList;
        Iterable iterable;
        if (list.size() < 4 || (size = list.size() - 4) < 0) {
            return null;
        }
        int i = 0;
        loop0: while (true) {
            listSubList = list.subList(i, i + 4);
            List list2 = listSubList;
            Intrinsics.i(list2, "<this>");
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Object next = it.next();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    arrayList.add(new Pair(next, next2));
                    next = next2;
                }
                iterable = arrayList;
            } else {
                iterable = EmptyList.f17557a;
            }
            Iterable<Pair> iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (Pair pair : iterable2) {
                    if (((Number) pair.getSecond()).longValue() - ((Number) pair.getFirst()).longValue() != 1) {
                        if (i == size) {
                            return null;
                        }
                        i++;
                    }
                }
                break loop0;
            }
            break;
        }
        return listSubList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025d A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:105:0x0264  */
    /* JADX WARN: Code duplicated, block: B:108:0x026c A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:128:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011f A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013a A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0157 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0176 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, LOOP:3: B:83:0x01c6->B:85:0x01cc, LOOP_END, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f3 A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fe A[Catch: Exception -> 0x0043, ChaloLocalException -> 0x0046, CancellationException -> 0x0049, TryCatch #2 {ChaloLocalException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x0043, blocks: (B:13:0x003e, B:46:0x00df, B:48:0x00e3, B:49:0x00e5, B:50:0x00f0, B:52:0x00f6, B:54:0x0109, B:56:0x0115, B:57:0x0119, B:59:0x011f, B:63:0x0127, B:65:0x012e, B:67:0x013a, B:69:0x0157, B:70:0x015f, B:71:0x0166, B:73:0x0176, B:77:0x017e, B:79:0x0185, B:80:0x019e, B:82:0x01a4, B:83:0x01c6, B:85:0x01cc, B:86:0x01e9, B:88:0x01f3, B:97:0x0229, B:91:0x01fe, B:92:0x020a, B:95:0x0223, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:102:0x025d, B:106:0x0265, B:108:0x026c, B:111:0x028f, B:24:0x0062, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:27:0x006e, B:29:0x0076, B:31:0x007e, B:33:0x0086, B:35:0x008e), top: B:118:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, long j, ContinuationImpl continuationImpl) {
        CheckSaveRideEligibilityUseCase$invoke$1 checkSaveRideEligibilityUseCase$invoke$1;
        String strH;
        long j2;
        String str3;
        int i;
        long j3;
        Iterable iterable;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        int size;
        int i2;
        List listA;
        long jK;
        ArrayList arrayList2;
        int i3;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        Iterator it3;
        Object next;
        long jAbs;
        Object next2;
        long jAbs2;
        Long l;
        Object arrayList4;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        String str4 = str;
        String str5 = str2;
        TimeUtilsContract timeUtilsContract = this.e;
        if (continuationImpl instanceof CheckSaveRideEligibilityUseCase$invoke$1) {
            checkSaveRideEligibilityUseCase$invoke$1 = (CheckSaveRideEligibilityUseCase$invoke$1) continuationImpl;
            int i4 = checkSaveRideEligibilityUseCase$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkSaveRideEligibilityUseCase$invoke$1.label = i4 - Integer.MIN_VALUE;
            } else {
                checkSaveRideEligibilityUseCase$invoke$1 = new CheckSaveRideEligibilityUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkSaveRideEligibilityUseCase$invoke$1 = new CheckSaveRideEligibilityUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = checkSaveRideEligibilityUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = checkSaveRideEligibilityUseCase$invoke$1.label;
        boolean z = true;
        try {
            if (i5 == 0) {
                ResultKt.b(objV);
                String strM = this.c.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(CheckEligibilityErrorType.UserNotLoggedIn.f10278a);
                }
                strH = this.d.h();
                if (strH == null) {
                    return new ChaloUseCaseResult.Failure(CheckEligibilityErrorType.InvalidCity.f10275a);
                }
                Flow flowI = this.b.i(str4, str5, strM, strH);
                checkSaveRideEligibilityUseCase$invoke$1.L$0 = str4;
                checkSaveRideEligibilityUseCase$invoke$1.L$1 = str5;
                checkSaveRideEligibilityUseCase$invoke$1.L$2 = strH;
                j2 = j;
                checkSaveRideEligibilityUseCase$invoke$1.J$0 = j2;
                checkSaveRideEligibilityUseCase$invoke$1.label = 1;
                objV = FlowKt.v(flowI, checkSaveRideEligibilityUseCase$invoke$1);
                if (objV == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i5 == 1) {
                j2 = checkSaveRideEligibilityUseCase$invoke$1.J$0;
                String str6 = (String) checkSaveRideEligibilityUseCase$invoke$1.L$2;
                str5 = (String) checkSaveRideEligibilityUseCase$invoke$1.L$1;
                String str7 = (String) checkSaveRideEligibilityUseCase$invoke$1.L$0;
                ResultKt.b(objV);
                strH = str6;
                str4 = str7;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = checkSaveRideEligibilityUseCase$invoke$1.I$0;
                j3 = checkSaveRideEligibilityUseCase$invoke$1.J$0;
                str5 = (String) checkSaveRideEligibilityUseCase$invoke$1.L$1;
                str3 = (String) checkSaveRideEligibilityUseCase$invoke$1.L$0;
                ResultKt.b(objV);
            }
            iterable = (List) objV;
            if (iterable == null) {
                iterable = EmptyList.f17557a;
            }
            arrayList = new ArrayList();
            for (Object obj : iterable) {
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
                if (!Intrinsics.d(premiumReserveTicketAppModel.b.g.f7121a, str3) && Intrinsics.d(premiumReserveTicketAppModel.b.h.f7121a, str5)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                if (i != 0) {
                    z = false;
                }
                return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
            }
            linkedHashMap = new LinkedHashMap();
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                l = new Long(((PremiumReserveTicketAppModel) obj2).b.b / CalendarModelKt.MillisecondsIn24Hours);
                arrayList4 = linkedHashMap.get(l);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(l, arrayList4);
                }
                ((List) arrayList4).add(obj2);
            }
            listA = a(CollectionsKt.u0(linkedHashMap.keySet()));
            if (listA == null) {
                if (i != 0) {
                    z = false;
                }
                return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
            }
            jK = timeUtilsContract.K(j3, timeUtilsContract.b());
            List list = listA;
            i3 = 10;
            arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                Iterable iterable2 = (Iterable) MapsKt.e(linkedHashMap, new Long(((Number) it.next()).longValue()));
                arrayList3 = new ArrayList(CollectionsKt.v(iterable2, i3));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new Long(timeUtilsContract.K(((PremiumReserveTicketAppModel) it2.next()).b.b, timeUtilsContract.b())));
                }
                it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                next = it3.next();
                if (!it3.hasNext()) {
                    jAbs = Math.abs(((Number) next).longValue() - jK);
                    do {
                        next2 = it3.next();
                        jAbs2 = Math.abs(((Number) next2).longValue() - jK);
                        if (jAbs > jAbs2) {
                            next = next2;
                            jAbs = jAbs2;
                        }
                    } while (it3.hasNext());
                }
                arrayList2.add(new Long(((Number) next).longValue()));
                i3 = 10;
            }
            if (((Number) CollectionsKt.W(arrayList2)).longValue() - ((Number) CollectionsKt.Y(arrayList2)).longValue() > 1800000) {
                List listU0 = CollectionsKt.u0(arrayList2);
                return new ChaloUseCaseResult.Success(new SaveRideEligibility(true, i != 0, new Long((((Number) listU0.get(1)).longValue() + ((Number) listU0.get(2)).longValue()) / ((long) 2))));
            }
            if (i != 0) {
                z = false;
            }
            return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
            List list2 = (List) objV;
            int i6 = list2 != null ? !list2.isEmpty() ? 1 : 0 : 0;
            PremiumBusRepository premiumBusRepository = this.f10274a;
            String lowerCase = strH.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Flow flowA = PremiumBusRepository.DefaultImpls.a(premiumBusRepository, lowerCase, null, 6);
            checkSaveRideEligibilityUseCase$invoke$1.L$0 = str4;
            checkSaveRideEligibilityUseCase$invoke$1.L$1 = str5;
            checkSaveRideEligibilityUseCase$invoke$1.L$2 = null;
            checkSaveRideEligibilityUseCase$invoke$1.J$0 = j2;
            checkSaveRideEligibilityUseCase$invoke$1.I$0 = i6;
            checkSaveRideEligibilityUseCase$invoke$1.label = 2;
            Object objV2 = FlowKt.v(flowA, checkSaveRideEligibilityUseCase$invoke$1);
            if (objV2 != coroutineSingletons) {
                str3 = str4;
                i = i6;
                objV = objV2;
                j3 = j2;
                iterable = (List) objV;
                if (iterable == null) {
                    iterable = EmptyList.f17557a;
                }
                arrayList = new ArrayList();
                while (r3.hasNext()) {
                    premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
                    if (!Intrinsics.d(premiumReserveTicketAppModel.b.g.f7121a, str3)) {
                    }
                }
                if (arrayList.isEmpty()) {
                    if (i != 0) {
                        z = false;
                    }
                    return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
                }
                linkedHashMap = new LinkedHashMap();
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    l = new Long(((PremiumReserveTicketAppModel) obj3).b.b / CalendarModelKt.MillisecondsIn24Hours);
                    arrayList4 = linkedHashMap.get(l);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(l, arrayList4);
                    }
                    ((List) arrayList4).add(obj3);
                }
                listA = a(CollectionsKt.u0(linkedHashMap.keySet()));
                if (listA == null) {
                    if (i != 0) {
                        z = false;
                    }
                    return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
                }
                jK = timeUtilsContract.K(j3, timeUtilsContract.b());
                List list3 = listA;
                i3 = 10;
                arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    Iterable iterable3 = (Iterable) MapsKt.e(linkedHashMap, new Long(((Number) it.next()).longValue()));
                    arrayList3 = new ArrayList(CollectionsKt.v(iterable3, i3));
                    it2 = iterable3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new Long(timeUtilsContract.K(((PremiumReserveTicketAppModel) it2.next()).b.b, timeUtilsContract.b())));
                    }
                    it3 = arrayList3.iterator();
                    if (it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    next = it3.next();
                    if (!it3.hasNext()) {
                        jAbs = Math.abs(((Number) next).longValue() - jK);
                        do {
                            next2 = it3.next();
                            jAbs2 = Math.abs(((Number) next2).longValue() - jK);
                            if (jAbs > jAbs2) {
                                next = next2;
                                jAbs = jAbs2;
                            }
                        } while (it3.hasNext());
                    }
                    arrayList2.add(new Long(((Number) next).longValue()));
                    i3 = 10;
                }
                if (((Number) CollectionsKt.W(arrayList2)).longValue() - ((Number) CollectionsKt.Y(arrayList2)).longValue() > 1800000) {
                    List listU1 = CollectionsKt.u0(arrayList2);
                    return new ChaloUseCaseResult.Success(new SaveRideEligibility(true, i != 0, new Long((((Number) listU1.get(1)).longValue() + ((Number) listU1.get(2)).longValue()) / ((long) 2))));
                }
                if (i != 0) {
                    z = false;
                }
                return new ChaloUseCaseResult.Success(new SaveRideEligibility(false, z, null));
            }
            return coroutineSingletons;
        } catch (ChaloLocalException e) {
            return new ChaloUseCaseResult.Failure(new CheckEligibilityErrorType.LocalError(e.getMessage()));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new ChaloUseCaseResult.Failure(new CheckEligibilityErrorType.UnknownError(e3.getMessage()));
        }
    }
}

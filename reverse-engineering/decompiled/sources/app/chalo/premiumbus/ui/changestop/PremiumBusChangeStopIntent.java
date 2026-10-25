package app.chalo.premiumbus.ui.changestop;

import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "", "InitializationIntent", "StopSelectedIntent", "ConfirmStopIntent", "BackPressed", "OnResultScreenAnimationComplete", "RetryLoadIntent", "DirectionsClickedIntent", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$BackPressed;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$ConfirmStopIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$DirectionsClickedIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$OnResultScreenAnimationComplete;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$RetryLoadIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$StopSelectedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusChangeStopIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$BackPressed;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackPressed extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressed f7529a = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -810761809;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$ConfirmStopIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmStopIntent extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmStopIntent f7530a = new ConfirmStopIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmStopIntent);
        }

        public final int hashCode() {
            return 1038832018;
        }

        public final String toString() {
            return "ConfirmStopIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$DirectionsClickedIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DirectionsClickedIntent extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7531a;

        public DirectionsClickedIntent(String stopId) {
            Intrinsics.i(stopId, "stopId");
            this.f7531a = stopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DirectionsClickedIntent) && Intrinsics.d(this.f7531a, ((DirectionsClickedIntent) obj).f7531a);
        }

        public final int hashCode() {
            return this.f7531a.hashCode();
        }

        public final String toString() {
            return vo1.B("DirectionsClickedIntent(stopId=", this.f7531a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusChangeStopArgs f7532a;

        static {
            PremiumBusChangeStopArgs.Companion companion = PremiumBusChangeStopArgs.INSTANCE;
        }

        public InitializationIntent(PremiumBusChangeStopArgs premiumBusChangeStopArgs) {
            this.f7532a = premiumBusChangeStopArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f7532a, ((InitializationIntent) obj).f7532a);
        }

        public final int hashCode() {
            return this.f7532a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f7532a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$OnResultScreenAnimationComplete;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnResultScreenAnimationComplete extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnResultScreenAnimationComplete f7533a = new OnResultScreenAnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnResultScreenAnimationComplete);
        }

        public final int hashCode() {
            return -1843997239;
        }

        public final String toString() {
            return "OnResultScreenAnimationComplete";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$RetryLoadIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryLoadIntent extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryLoadIntent f7534a = new RetryLoadIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadIntent);
        }

        public final int hashCode() {
            return -1093526946;
        }

        public final String toString() {
            return "RetryLoadIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent$StopSelectedIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectedIntent extends PremiumBusChangeStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7535a;

        public StopSelectedIntent(String stopId) {
            Intrinsics.i(stopId, "stopId");
            this.f7535a = stopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSelectedIntent) && Intrinsics.d(this.f7535a, ((StopSelectedIntent) obj).f7535a);
        }

        public final int hashCode() {
            return this.f7535a.hashCode();
        }

        public final String toString() {
            return vo1.B("StopSelectedIntent(stopId=", this.f7535a, ")");
        }
    }
}

package app.chalo.ridehailing.feedback;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "", "Initialize", "OnSeeTripDetailsCardClick", "OnNeedHelpClick", "OnUserFeedbackRatingClick", "OnFeedbackRatingReasonClick", "OnFeedbackSubtagClick", "OnSubmitFeedbackCtaClick", "OnSkipUserFeedbackCtaClick", "OnFeedbackOtherReasonDescriptionChange", "OnAnimationCompletedIntent", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$Initialize;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnAnimationCompletedIntent;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackOtherReasonDescriptionChange;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackRatingReasonClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackSubtagClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnNeedHelpClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSeeTripDetailsCardClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSkipUserFeedbackCtaClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSubmitFeedbackCtaClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnUserFeedbackRatingClick;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RideFeedbackViewIntents {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$Initialize;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initialize extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initialize f9159a = new Initialize();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initialize);
        }

        public final int hashCode() {
            return 1083854870;
        }

        public final String toString() {
            return "Initialize";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnAnimationCompletedIntent;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAnimationCompletedIntent extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnAnimationCompletedIntent f9160a = new OnAnimationCompletedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnAnimationCompletedIntent);
        }

        public final int hashCode() {
            return 630822440;
        }

        public final String toString() {
            return "OnAnimationCompletedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackOtherReasonDescriptionChange;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFeedbackOtherReasonDescriptionChange extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9161a;

        public OnFeedbackOtherReasonDescriptionChange(String text) {
            Intrinsics.i(text, "text");
            this.f9161a = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFeedbackOtherReasonDescriptionChange) && Intrinsics.d(this.f9161a, ((OnFeedbackOtherReasonDescriptionChange) obj).f9161a);
        }

        public final int hashCode() {
            return this.f9161a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnFeedbackOtherReasonDescriptionChange(text=", this.f9161a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackRatingReasonClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFeedbackRatingReasonClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserFeedbackReasonData f9162a;

        public OnFeedbackRatingReasonClick(UserFeedbackReasonData reason) {
            Intrinsics.i(reason, "reason");
            this.f9162a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFeedbackRatingReasonClick) && Intrinsics.d(this.f9162a, ((OnFeedbackRatingReasonClick) obj).f9162a);
        }

        public final int hashCode() {
            return this.f9162a.hashCode();
        }

        public final String toString() {
            return "OnFeedbackRatingReasonClick(reason=" + this.f9162a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnFeedbackSubtagClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFeedbackSubtagClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9163a;

        public OnFeedbackSubtagClick(String subtagId) {
            Intrinsics.i(subtagId, "subtagId");
            this.f9163a = subtagId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFeedbackSubtagClick) && Intrinsics.d(this.f9163a, ((OnFeedbackSubtagClick) obj).f9163a);
        }

        public final int hashCode() {
            return this.f9163a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnFeedbackSubtagClick(subtagId=", this.f9163a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnNeedHelpClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnNeedHelpClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnNeedHelpClick f9164a = new OnNeedHelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnNeedHelpClick);
        }

        public final int hashCode() {
            return 2063764076;
        }

        public final String toString() {
            return "OnNeedHelpClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSeeTripDetailsCardClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSeeTripDetailsCardClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSeeTripDetailsCardClick f9165a = new OnSeeTripDetailsCardClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSeeTripDetailsCardClick);
        }

        public final int hashCode() {
            return -246124215;
        }

        public final String toString() {
            return "OnSeeTripDetailsCardClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSkipUserFeedbackCtaClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSkipUserFeedbackCtaClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSkipUserFeedbackCtaClick f9166a = new OnSkipUserFeedbackCtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSkipUserFeedbackCtaClick);
        }

        public final int hashCode() {
            return -1895910516;
        }

        public final String toString() {
            return "OnSkipUserFeedbackCtaClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnSubmitFeedbackCtaClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSubmitFeedbackCtaClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSubmitFeedbackCtaClick f9167a = new OnSubmitFeedbackCtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSubmitFeedbackCtaClick);
        }

        public final int hashCode() {
            return 1742145274;
        }

        public final String toString() {
            return "OnSubmitFeedbackCtaClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents$OnUserFeedbackRatingClick;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnUserFeedbackRatingClick extends RideFeedbackViewIntents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserFeedbackRatingData f9168a;

        public OnUserFeedbackRatingClick(UserFeedbackRatingData rating) {
            Intrinsics.i(rating, "rating");
            this.f9168a = rating;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUserFeedbackRatingClick) && Intrinsics.d(this.f9168a, ((OnUserFeedbackRatingClick) obj).f9168a);
        }

        public final int hashCode() {
            return this.f9168a.hashCode();
        }

        public final String toString() {
            return "OnUserFeedbackRatingClick(rating=" + this.f9168a + ")";
        }
    }
}

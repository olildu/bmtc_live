package app.chalo.ridehailing.common;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.ridehailing.feedback.RatingReaction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridehailing/common/RideHailingUIStateCommonFactory;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideHailingUIStateCommonFactory {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/common/RideHailingUIStateCommonFactory$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9096a;

            static {
                int[] iArr = new int[RatingReaction.values().length];
                try {
                    iArr[RatingReaction.ANGRY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RatingReaction.DISAPPOINTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RatingReaction.NEUTRAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RatingReaction.SATISFIED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RatingReaction.HIGHLY_SATISFIED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f9096a = iArr;
            }
        }

        public static IconType a(RatingReaction rating) {
            Intrinsics.i(rating, "rating");
            int i = WhenMappings.f9096a[rating.ordinal()];
            if (i == 1) {
                return IconType.IC_FEEDBACK_RATING_ANGRY;
            }
            if (i == 2) {
                return IconType.IC_FEEDBACK_RATING_DISSATISFIED;
            }
            if (i == 3) {
                return IconType.IC_FEEDBACK_RATING_NEUTRAL;
            }
            if (i == 4) {
                return IconType.IC_FEEDBACK_RATING_SATISFIED;
            }
            if (i == 5) {
                return IconType.IC_FEEDBACK_RATING_HIGHLY_SATISFIED;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static LottieType b(RatingReaction rating) {
            Intrinsics.i(rating, "rating");
            int i = WhenMappings.f9096a[rating.ordinal()];
            if (i == 1) {
                return LottieType.FEEDBACK_RATING_ANGRY;
            }
            if (i == 2) {
                return LottieType.FEEDBACK_RATING_DISSATISFIED;
            }
            if (i == 3) {
                return LottieType.FEEDBACK_RATING_NEUTRAL;
            }
            if (i == 4) {
                return LottieType.FEEDBACK_RATING_SATISFIED;
            }
            if (i == 5) {
                return LottieType.FEEDBACK_RATING_HIGHLY_SATISFIED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}

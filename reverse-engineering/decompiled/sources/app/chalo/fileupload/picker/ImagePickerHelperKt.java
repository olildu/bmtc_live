package app.chalo.fileupload.picker;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerHelperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2786a;

        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[PermissionState.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionState.REQUIRES_EXPLANATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionState.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PermissionState.NOT_DETERMINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2786a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ImagePicker imagePicker, PermissionHandler permissionHandler, ImagePickerConfig imagePickerConfig, Function1 function1, Function0 function0, Function0 function2, ContinuationImpl continuationImpl) {
        ImagePickerHelperKt$checkPermissionAndPickImage$1 imagePickerHelperKt$checkPermissionAndPickImage$1;
        Function1 function3;
        ImagePicker imagePicker2;
        Function0 function4;
        int i;
        Object objA;
        if (continuationImpl instanceof ImagePickerHelperKt$checkPermissionAndPickImage$1) {
            imagePickerHelperKt$checkPermissionAndPickImage$1 = (ImagePickerHelperKt$checkPermissionAndPickImage$1) continuationImpl;
            int i2 = imagePickerHelperKt$checkPermissionAndPickImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imagePickerHelperKt$checkPermissionAndPickImage$1.label = i2 - Integer.MIN_VALUE;
            } else {
                imagePickerHelperKt$checkPermissionAndPickImage$1 = new ImagePickerHelperKt$checkPermissionAndPickImage$1(continuationImpl);
            }
        } else {
            imagePickerHelperKt$checkPermissionAndPickImage$1 = new ImagePickerHelperKt$checkPermissionAndPickImage$1(continuationImpl);
        }
        Object objB = imagePickerHelperKt$checkPermissionAndPickImage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = imagePickerHelperKt$checkPermissionAndPickImage$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            AppPermission appPermission = AppPermission.CAMERA;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$0 = imagePicker;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$1 = permissionHandler;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$2 = imagePickerConfig;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$3 = function1;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$4 = function0;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$5 = function2;
            imagePickerHelperKt$checkPermissionAndPickImage$1.label = 1;
            objB = permissionHandler.b(appPermission, imagePickerHelperKt$checkPermissionAndPickImage$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            function2 = (Function0) imagePickerHelperKt$checkPermissionAndPickImage$1.L$5;
            function0 = (Function0) imagePickerHelperKt$checkPermissionAndPickImage$1.L$4;
            function1 = (Function1) imagePickerHelperKt$checkPermissionAndPickImage$1.L$3;
            imagePickerConfig = (ImagePickerConfig) imagePickerHelperKt$checkPermissionAndPickImage$1.L$2;
            permissionHandler = (PermissionHandler) imagePickerHelperKt$checkPermissionAndPickImage$1.L$1;
            imagePicker = (ImagePicker) imagePickerHelperKt$checkPermissionAndPickImage$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i3 == 2) {
                ResultKt.b(objB);
                return objB;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
                return objB;
            }
            function4 = (Function0) imagePickerHelperKt$checkPermissionAndPickImage$1.L$3;
            function3 = (Function1) imagePickerHelperKt$checkPermissionAndPickImage$1.L$2;
            imagePickerConfig = (ImagePickerConfig) imagePickerHelperKt$checkPermissionAndPickImage$1.L$1;
            imagePicker2 = (ImagePicker) imagePickerHelperKt$checkPermissionAndPickImage$1.L$0;
            ResultKt.b(objB);
        }
        PermissionState permissionState = (PermissionState) objB;
        function3.invoke(permissionState);
        i = WhenMappings.f2786a[permissionState.ordinal()];
        if (i != 1) {
            if (i != 2 || i == 3 || i == 4 || i == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        function4.invoke();
        imagePickerHelperKt$checkPermissionAndPickImage$1.L$0 = null;
        imagePickerHelperKt$checkPermissionAndPickImage$1.L$1 = null;
        imagePickerHelperKt$checkPermissionAndPickImage$1.L$2 = null;
        imagePickerHelperKt$checkPermissionAndPickImage$1.L$3 = null;
        imagePickerHelperKt$checkPermissionAndPickImage$1.label = 4;
        objA = imagePicker2.a(imagePickerConfig, imagePickerHelperKt$checkPermissionAndPickImage$1);
        if (objA != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
        if (PermissionStateKt.a((PermissionState) objB)) {
            function0.invoke();
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$0 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$1 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$2 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$3 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$4 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$5 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.label = 2;
            Object objA2 = imagePicker.a(imagePickerConfig, imagePickerHelperKt$checkPermissionAndPickImage$1);
            if (objA2 != coroutineSingletons) {
                return objA2;
            }
        } else {
            function2.invoke();
            ChannelFlowTransformLatest channelFlowTransformLatestC = permissionHandler.c(AppPermission.CAMERA);
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$0 = imagePicker;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$1 = imagePickerConfig;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$2 = function1;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$3 = function0;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$4 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.L$5 = null;
            imagePickerHelperKt$checkPermissionAndPickImage$1.label = 3;
            objB = FlowKt.t(channelFlowTransformLatestC, imagePickerHelperKt$checkPermissionAndPickImage$1);
            if (objB != coroutineSingletons) {
                function3 = function1;
                imagePicker2 = imagePicker;
                function4 = function0;
                PermissionState permissionState2 = (PermissionState) objB;
                function3.invoke(permissionState2);
                i = WhenMappings.f2786a[permissionState2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                    }
                    return null;
                }
                function4.invoke();
                imagePickerHelperKt$checkPermissionAndPickImage$1.L$0 = null;
                imagePickerHelperKt$checkPermissionAndPickImage$1.L$1 = null;
                imagePickerHelperKt$checkPermissionAndPickImage$1.L$2 = null;
                imagePickerHelperKt$checkPermissionAndPickImage$1.L$3 = null;
                imagePickerHelperKt$checkPermissionAndPickImage$1.label = 4;
                objA = imagePicker2.a(imagePickerConfig, imagePickerHelperKt$checkPermissionAndPickImage$1);
                if (objA != coroutineSingletons) {
                    return objA;
                }
            }
        }
        return coroutineSingletons;
    }
}
